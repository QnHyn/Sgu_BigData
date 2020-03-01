package com.hynqn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hynqn.dao.UserDao;
import com.hynqn.dao.impl.UserDaoImpl;

/**
 *  处理用户注册的Servlet
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取用户输入的用户名密码邮箱
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		// 创建UserDao对象
		UserDao userdao = new UserDaoImpl();
		boolean flag = userdao.checkUserName(username);
		if(flag) {
			// 用户名已存在, 设置提示信息放在request域中
			request.setAttribute("msg", "用户名已存在");
			//转发到注册页面
			request.getRequestDispatcher("/pages/regist.jsp").forward(request, response);
		} else {
			// 用户名可用, 保存在的数据库中
			userdao.saveUser(username, password, email);
			//重定向到登录界面
			response.sendRedirect(request.getContextPath()+"/pages/login.jsp");
		}
	}

}
