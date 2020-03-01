package com.hynqn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hynqn.bean.User;

//验证用户是否登录
public class LoginFilter implements Filter {
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
		// TODO Auto-generated method stub
	}
	// 判断用户是否已经登录
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		// 获取Session对象
		HttpSession session = req.getSession();
		// 从Session域中获取session对象
		User user = (User) session.getAttribute("user");
		//System.out.print(user);
		//判断User对象是否为Null
		if(user != null) {
			// 已经登录 放行请求
			chain.doFilter(request, response);
		}else {
			// 没有登录 想request域中添加提示信息并转发到登录页面
			req.setAttribute("msg", "该操作需要先登录");
			// 转发到登录界面
			req.getRequestDispatcher("/pages/login.jsp").forward(request, response);
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
