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
		//1.��ȡ�������
		String code = SecurityCode.getSecurityCode();
		//2.������ִ���session
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("code", code);
		//3.���������ת��ΪͼƬ
		BufferedImage image = SecurityImage.createImage(code);
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setContentType("image/png");
		OutputStream out = resp.getOutputStream();
		//4.��ͼƬд��ҳ����
		ImageIO.write(image, "png", out);
		//5.�ر���Դ
		out.close();
		return null;
	}
}
