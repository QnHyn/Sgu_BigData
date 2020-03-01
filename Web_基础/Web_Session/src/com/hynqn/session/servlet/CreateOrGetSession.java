package com.hynqn.session.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateOrGetSession
 */
@WebServlet("/CreateOrGetSession")
public class CreateOrGetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CreateOrGetSession() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 创建或获取session对象
		HttpSession session = request.getSession();
		// 获取session对象的id值
		String id = session.getId();
		System.out.println("当前的id值:"+id);
		// 向session域中添加用户
		session.setAttribute("user", "admin");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
