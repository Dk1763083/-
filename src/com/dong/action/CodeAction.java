package com.dong.action;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dong.util.SecurityCode;
import com.dong.util.SecurityImage;

public class CodeAction {
	public String securityCode() throws Exception{
		//1.获取随机数字
		String code = SecurityCode.getSecurityCode();
		//2.随机数字存入session
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("code", code);
		//3.将随机数字转化为图片
		BufferedImage image = SecurityImage.createImage(code);
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setContentType("image/png");
		OutputStream out = resp.getOutputStream();
		//4.将图片写到页面上
		ImageIO.write(image, "png", out);
		//5.关闭资源
		out.close();
		return null;
	}
}
