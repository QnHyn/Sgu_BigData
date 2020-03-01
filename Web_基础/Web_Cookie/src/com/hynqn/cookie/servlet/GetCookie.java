package com.hynqn.cookie.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取cookie参数
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			// 遍历得到每一个cookies对象
			for(Cookie cookie : cookies){
				// 获得cookie的名字
				String name = cookie.getName();
				// 获取cookie的值
				String value = cookie.getValue();
				System.out.println("cookies的名字是:"+name);
				System.out.println("cookies的值是:"+value);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
