package com.dong.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.dong.dao.UserDao;
import com.dong.entity.User;
import com.dong.util.MyBatisUtil;

public class UserServiceImpl implements UserService{
//1.登录
	public boolean login(String username, String password) {
		UserDao ud=MyBatisUtil.getMapper(UserDao.class);
		try{
			User user = ud.SelectByUnamePwd(username, password);
			if(user!=null){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			MyBatisUtil.close();
		}
	}

//2.根据用户名查找用户信息
	public User queryByUname(String username) {
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		try{
			User user = ud.SelectByUname(username);
			return user;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			MyBatisUtil.close();
		}
	}
//3.注册
	public boolean regist(User user) {
		UserDao ud = MyBatisUtil.getMapper(UserDao.class);
		
		try{
		User u = ud.SelectByUname(user.getUsername());
		    if(u!=null){
		    	return false;
		    }else{
		    	ud.InsertUser(user);
				MyBatisUtil.commit();
				return true;
		    }			
		}catch(Exception e){
			e.printStackTrace();
			MyBatisUtil.rollback();
			return false;
		}
	}

//4.更新用户信息
	public void updateUser(User user) {
		UserDao ud=MyBatisUtil.getMapper(UserDao.class);
		try{
			ud.UpdateUser(user);
			MyBatisUtil.commit();
		}catch(Exception e){
			e.printStackTrace();
			MyBatisUtil.rollback();
		}
	}
//5.根据用户名更新用户密码
	public void updateUserPwd(String username, String password) {
		UserDao ud=MyBatisUtil.getMapper(UserDao.class);
		try{
			ud.UpdatePwd(username, password);
			MyBatisUtil.commit();
		}catch(Exception e){
			e.printStackTrace();
			MyBatisUtil.rollback();
		}
	}
}
