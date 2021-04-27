package com.dong.util;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
	private static InputStream is = null;
	private static SqlSessionFactory factory = null;
	private static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>();
	//静态代码块
	static{
		try {
			 is = Resources.getResourceAsStream("mybatis-config.xml");
			 factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//1.获取SqlSession对象
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = tl.get();
		if(sqlSession!=null){
			return sqlSession;
		}else{
			sqlSession = factory.openSession();
			tl.set(sqlSession);
			return sqlSession;
		}
	}
	//2.关闭SqlSession资源
	public static void close(){
		SqlSession sqlSession = getSqlSession();
		if(sqlSession!=null){
			sqlSession.close();
			tl.remove();
		}
	}
	//3.获取dao接口的实现类
	public static <T> T getMapper(Class<T> c){
		SqlSession sqlSession = getSqlSession();
		T t = sqlSession.getMapper(c);
		return t;
	}
	//4.提交
	public static void commit(){
		SqlSession sqlSession = getSqlSession();
		sqlSession.commit();
		close();
	}
	//5.回滚
	public static void rollback(){
		SqlSession sqlSession = getSqlSession();
		sqlSession.rollback();
		close();
	}
	//6.日期转换
		//String  ---  java.sql.Date
		public static java.sql.Date dealStringDate(String date){
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date utilDate = sdf.parse(date);
				return new java.sql.Date(utilDate.getTime());
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
		//java.util.Date|java.sql.Date  ---  String
		public static String dealDate(java.util.Date date){
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String time = sdf.format(date);
				return time;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
}
