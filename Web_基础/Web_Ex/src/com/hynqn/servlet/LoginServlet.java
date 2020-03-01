package com.hynqn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hynqn.bean.User;
import com.hynqn.dao.UserDao;
import com.hynqn.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//创建UserDao对象 调用验证方法
		UserDao userDao =  new UserDaoImpl();
		//调用验证用户名和密码的方法
		User user = userDao.checkUsernameAndPassword(username, password);
		if(user != null) {
			//用户名和密码正确 重定向登录成功页面
			System.out.print("登录成功");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			response.sendRedirect(request.getContextPath()+"/GetUsersServlet");
			
		}else {
			System.out.print("登录失败");
			//用户名或密码不正确，设置-一个错误提示信息并放到request域中
			request.setAttribute("msg", "用户名或密码错误!");
			//用户名和密码不正确 转发到登录页面 获取转发器
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/login.jsp");
			// 转发
			requestDispatcher.forward(request, response);
		}
			
	}

}
