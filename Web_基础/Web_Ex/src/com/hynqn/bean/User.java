package com.hynqn.bean;

import java.io.Serializable;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements Serializable, HttpSessionBindingListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private String email;
	
	// 所有参数的构造器
	public User(Integer id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	// 无参构造器
	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	// 向session中添加User对象时调用
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("向session中添加User对象");
		// 获取session对象
		HttpSession session = event.getSession();
		// 获取ServletContext对象
		ServletContext application = session.getServletContext();
		// 从application获取当前人数
		Integer count = (Integer)application.getAttribute("count");
		if(count == null) {
			// 之前还没有人在线 我是第一人
			// 向application中设置当前人数为1
			application.setAttribute("count", 1);
		}else{
			// 证明已经有人在线
			application.setAttribute("count", count + 1);
		}
	}
	
	// 从session中移除User对象时调用
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("从session中移除User对象");
		// 获取session对象
		HttpSession session = event.getSession();
		// 获取ServletContext对象
		ServletContext application = session.getServletContext();
		// 从application获取当前人数
		Integer count = (Integer)application.getAttribute("count");
		application.setAttribute("count", count - 1);
	}
}
