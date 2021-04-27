package com.dong.test;

import java.util.List;

import org.junit.Test;

import com.dong.dao.ProductDao;
import com.dong.dao.UserDao;
import com.dong.entity.Product;
import com.dong.entity.User;
import com.dong.util.MyBatisUtil;

public class TestDao {
         //UserDao	
	//1.根据用户名密码查询用户信息
	@Test
 public void TestUnamePwd(){
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);		
		   User user = ud.SelectByUnamePwd("liucy", "2222");
		   System.out.println(user);
		   MyBatisUtil.close();
	}
	//2.插入新用户
	@Test
	public void TestInsert(){
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("ddk");
		user.setPassword("1234");
		user.setName("董柯");
		user.setZip("100000");
		user.setAddress("禹州");	
		try{
			ud.InsertUser(user);
			MyBatisUtil.commit();
		}catch(Exception e){
			e.printStackTrace();
			MyBatisUtil.rollback();			
		}		
	}
	//3.查询所有用户名
	@Test
	public void TsetAllUname(){
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		  List<String> list =  ud.SelectAllUname();	
		  for (String string : list) {
			  System.out.println(string);	
		}						
		    MyBatisUtil.close();
	}
	//4.根据用户名查询用户信息
	@Test
	public void TestUname(){	
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		     User user = ud.SelectByUname("luxw");
		     System.out.println(user);
		     MyBatisUtil.close();
	}
	//5.根据用户名更新用户信息
	@Test
	public void TestUpdate(){
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		   User user = new User();
		   user.setUsername("ddk");
		   user.setName("董大柯");
		   user.setZip("100001");
		   user.setAddress("张得镇");
		   try{
			   ud.UpdateUser(user);
			   MyBatisUtil.commit();
		   }catch(Exception e){
			   e.printStackTrace();
			   MyBatisUtil.rollback();
		   }		   
	}
	//6.根据用户名更新用户密码
	@Test
	public void TsetPwd(){		
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		  try{
			  ud.UpdatePwd("dk","1234");
			  MyBatisUtil.commit();
		  }catch(Exception e){
			  e.printStackTrace();
			  MyBatisUtil.rollback();
		  }
	}
	   //ProductDao
//	
@Test
    //1.查询所有商品信息
	public void TsetAllPro(){
	ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
		List<Product> pro =  pd.SelectAllByIndex(1, 5);	
		for (Product product : pro) {
			 System.out.println(product);	
		}			 			
		  MyBatisUtil.close();
	}
@Test
    //2.根据id查询商品信息
   public void TsetById(){
	ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
	     Product pro = pd.SelectById(3);
	     System.out.println(pro);
	     MyBatisUtil.close();
}
@Test
    //3.查询商品总数
public void TestCount(){
	ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
	 System.out.println(pd.SelectCount());
	 MyBatisUtil.close();
}
}
