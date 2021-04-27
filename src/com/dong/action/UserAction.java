package com.dong.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dong.entity.User;
import com.dong.service.ProductService;
import com.dong.service.UserService;
import com.dong.service.UserServiceImpl;

public class UserAction{
	private String username;
	private String password;
	private String code;
	private User user;
	private UserService us = new UserServiceImpl();
	private HttpSession session = ServletActionContext.getRequest().getSession();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	//1.登录
	public String Login(){
		 String scode = (String)session.getAttribute("code");
		    if(scode.equals(code)){
		        boolean flag = us.login(username, password);
		        if(flag){
		        	   session.setAttribute("username", username);
		        	    return "QueryAllPro";
		        }else{
		        	  return "Login.jsp";
		        }
		    }else{
		    	 return "Login.jsp";
		    }		
	}
	//2.注册
	public String Regist(){		
	   boolean flag = us.regist(user);
	   if(flag){
		      return "Login.jsp";
	   }else{
		      return "Regist.jsp";
	   }		
	}
	//3.修改用户信息
	 public String UpdateUser(){		
		   us.updateUser(user);
		     return "ChangeUserMessageSuccess.jsp";
	 }
	 //4.修改用户密码
	 public String UpdateUserPwd(){
		   us.updateUserPwd(username, password);
		   return "ChangeUserPwdSuccess.jsp";
	 }
	//5.安全退出
		public String SafeQuit(){
			session.invalidate();
			return "QueryAllPro";
		}
	//6.用户管理界面
		public String UserManage(){
			user = us.queryByUname(username);
			session.setAttribute("User", user);
			return "UserManageView.jsp";
		}
}


