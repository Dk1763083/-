package com.dong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dong.entity.User;

public interface UserDao {
	    //1.�����˺������ѯ�û���Ϣ
		User SelectByUnamePwd(@Param("uname")String username,@Param("pwd")String password);
		//2.�������û�
		void InsertUser(User user);
		//3.��ѯ�����˺���Ϣ
		List<String> SelectAllUname();
		//4.ͨ���˺Ų�ѯ�û���Ϣ
		User SelectByUname(String username);
		//5.�����û���Ϣ
		void UpdateUser(User user);
		//6.�޸��û�����
		void UpdatePwd(@Param("uname")String username,@Param("pwd")String password);
}
