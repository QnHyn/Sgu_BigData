package com.hynqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hynqn.bean.User;
import com.hynqn.dao.UserDao;
import com.hynqn.dao.impl.UserDaoImpl;

/**
 * 获取所有用户的Servlet
 */
public class GetUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 创建UserDao对象
		UserDao userdao = new UserDaoImpl();
		// 调用UserDao中获取所有用户的方法
		List<User> users = userdao.getUsers();
		// 将用户信息放到request域中
		request.setAttribute("users", users);
		// 转发到主页面
		request.getRequestDispatcher("/pages/main.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
