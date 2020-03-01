package com.qitest.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 最终创建Servlet方式
 */
public class AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public AutoServlet() {
        super();
    }

	// 用来处理get请求
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet方法被调用");
		/**
		 * request参数的作用
		 * get 请求的中文乱码问题的解决方案。
		  *   在Servers文件夹下server.xm1的配置文件的第一个Connector标签中添加属性URIEncoding ="UTF-8"
		 */
		//1. request获取请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		// 2. request获取项目的虚拟路径 /Web_Servlet
		String contextpath = request.getContextPath();
		System.out.println(contextpath);
		// 3. request转发
		// 先获取转发器 ctrl+1 补全类型声明
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
		// 进行请求转发
		requestDispatcher.forward(request, response);
	}

	// 用来处理Post请求
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost方法被调用");
		/**
		 * response参数的作用
		 * Post请求的中文乱码问题的解决方案。
		  *  在第一次获取请求参数之前设置字符集为UTF-8  
		 * request.setCharacterEncoding("UTF-8");
		 */
		// 1. response给浏览器响应界面或字符串
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		/**
		  * 响应乱码(不分get和post)的一个解决方案
		  * 获取流之前设置响应数据的类型 
		 */
		writer.write("请求成功");
		// 2. response重定向
		response.sendRedirect("success.html");
	}

}
