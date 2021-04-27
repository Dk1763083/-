package com.dong.service;

import java.util.List;

import com.dong.entity.User;

public interface UserService {
	//1.登录
		boolean login(String username,String password);
	//2.根据用户名查找用户信息
		User queryByUname(String username);
	//3.注册
		boolean regist(User user);		
	//4.更新用户信息
		void updateUser(User user);
	//5.根据用户名更新用户密码
		void updateUserPwd(String username,String password);
}
