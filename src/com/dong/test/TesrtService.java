package com.dong.test;
import java.util.List;

import org.junit.Test;

import com.dong.entity.Product;
import com.dong.entity.User;
import com.dong.service.ProductService;
import com.dong.service.ProductServiceImpl;
import com.dong.service.UserService;
import com.dong.service.UserServiceImpl;

public class TesrtService {
            //UserService
	UserService us = new UserServiceImpl();
//1.登录
@Test
public void login(){
	System.out.println(us.login("dk", "1234"));	
}

//3.根据用户名查找用户信息
@Test
public void queryByUname(){
	     User user = us.queryByUname("dk");
	     System.out.println(user);	
}
//4.注册
@Test
public void insertUser(){
	    User user = new User();
	    user.setUsername("qqq");
	    user.setPassword("1234");
	    user.setName("张无忌");
	    user.setZip("100002");
	    user.setAddress("瓦坎达");
	    boolean flag =  us.regist(user);	
	    System.out.println(flag);
}
//5.更新用户信息
@Test
public void updateUser(){
	User user = new User();
	user.setUsername("ddd");
	user.setName("🤡");
	user.setZip("333333");
	user.setAddress("奥斯汀吨");
	 us.updateUser(user);
}
//6.根据用户名更新用户密码
@Test
public void updatePwd(){
	   us.updateUserPwd("ddk", "123456");
}



             //ProductService
      
//1.查询所有商品信息
@Test
public void queryAllPro(){
	 ProductService ps = new ProductServiceImpl(); 
	     List<Product> Pro = ps.queryAllPro(3);
	         for (Product product : Pro) {
				System.out.println(product);
			}	     
}
//2.查询商品页数
@Test
public void queryCount(){
	 ProductService ps = new ProductServiceImpl(); 
	     System.out.println(ps.queryCount());
}
//3.通过id查询商品信息
@Test
public void queryById(){
	 ProductService ps = new ProductServiceImpl(); 
	      System.out.println(ps.queryById(4));
}
}
