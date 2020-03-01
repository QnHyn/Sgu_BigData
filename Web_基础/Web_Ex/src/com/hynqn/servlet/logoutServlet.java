package com.hynqn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 注销Servlet
 */
public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public logoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取session对象
		HttpSession session = request.getSession();
		// 使session对象失效
		session.invalidate();
		// 重新定向到首页
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
