package com.hynqn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hynqn.dao.UserDao;
import com.hynqn.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class CheckUsernameServlet
 */
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CheckUsernameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println(username);
		// 创建userdao对象
		UserDao userdao = new UserDaoImpl();
		// 调用userdao中用户名是否存在
		boolean flag = userdao.checkUserName(username);
		response.setContentType("text/html;charset=UTF-8");
		if(flag){
			response.getWriter().write("用户名已存在");
		}else {
			response.getWriter().write("用户名可用");
		}
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
