package com.dong.inter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class Interceptor extends MethodFilterInterceptor{
	protected String doIntercept(ActionInvocation ai) throws Exception {
		try{
			HttpSession session=ServletActionContext.getRequest().getSession();
			String username=(String)session.getAttribute("username");
			if(username!=null){
				ai.invoke();
				return null;
			}else{
				return "Login.jsp";
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
