package com.hynqn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class HelloFilter
 */
public class HelloFilter implements Filter {
    public HelloFilter() {
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
		// TODO Auto-generated method stub
	}

	// 拦截请求的方法
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("①啊哈哈 过来 给钱");
		// 放行请求
		chain.doFilter(request, response);
		System.out.println("③小鬼又回来了");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
