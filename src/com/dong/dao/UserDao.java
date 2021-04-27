package com.dong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dong.entity.User;

public interface UserDao {
	    //1.根据账号密码查询用户信息
		User SelectByUnamePwd(@Param("uname")String username,@Param("pwd")String password);
		//2.插入新用户
		void InsertUser(User user);
		//3.查询所有账号信息
		List<String> SelectAllUname();
		//4.通过账号查询用户信息
		User SelectByUname(String username);
		//5.更新用户信息
		void UpdateUser(User user);
		//6.修改用户密码
		void UpdatePwd(@Param("uname")String username,@Param("pwd")String password);
}
