package com.hynqn.cookie.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 持久化cookies
 */
public class PersistCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PersistCookies() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("user3","man");
		//持久化Cookie对象为1分钟
		/*
		 * setMaxAge(int age)
		 *	age > 0 : Cookie对象age秒后失效
		 *	age = 0 : Cookie对象立即失效
		 *	age < 0 :默认，会话级别的Cookie对象
		 */
		cookie.setMaxAge(60) ;
		response.addCookie(cookie);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
