package com.hynqn.cookie.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 创建Cookie对象的Servlet
 */
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CreateCookie() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 创建cookie对象 
		//Cookie对象的名字不能使用中文，
		//Cookie对象的值可以使用中文但是需要指定字符集进行编码
		//而且获取Cookie对象还需要指定字符集进行解码
		Cookie cookie = new Cookie("user","admin");
		// 2.将cookie发送给浏览器
		response.addCookie(cookie);
	
		Cookie cookie1 = new Cookie("user2","pathcookie");
		//设置Cookie对象的有效路径，默认Cookie对象的有效路径是项目的根目录
		cookie1.setPath(request.getContextPath()+"/pages");
		response.addCookie(cookie1);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
