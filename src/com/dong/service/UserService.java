package com.dong.service;

import java.util.List;

import com.dong.entity.User;

public interface UserService {
	//1.��¼
		boolean login(String username,String password);
	//2.�����û��������û���Ϣ
		User queryByUname(String username);
	//3.ע��
		boolean regist(User user);		
	//4.�����û���Ϣ
		void updateUser(User user);
	//5.�����û��������û�����
		void updateUserPwd(String username,String password);
}
