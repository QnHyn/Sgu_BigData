package com.hynqn.dao.impl;

import java.util.List;

import com.hynqn.bean.User;
import com.hynqn.dao.BasicDao;
import com.hynqn.dao.UserDao;

public class UserDaoImpl implements UserDao {
	// 创建BasicDao对象
	BasicDao basicdao = new BasicDao();

	@Override
	public User checkUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select id,username,password,email from users where username = ? and password = ?";
		// 调用BasicDao中获取一个对象的方法
		User bean = basicdao.getBean(User.class, sql, username,password);
		return bean;
	}
	
	public boolean checkUserName(String username) {
		// TODO Auto-generated method stub
		String sql = "select id,username,password,email from users where username = ?";
		// 调用BasicDao中获取一个对象的方法
		User bean = basicdao.getBean(User.class, sql, username);
		return bean != null;		
	}
	
	public void saveUser(String username, String password, String email) {
		String sql = "insert into users(username, password, email) value (?, ?, ?)";
		// 调用调用BasicDao中通用的增删改方法
		basicdao.update(sql, username, password, email);
	}

	@Override
	public List<User> getUsers() {
		String sql = "select id,username,password,email from users";
		// 调用BasicDao中获取一个List方法
		List<User> beanList = basicdao.getBeanList(User.class, sql);
		return beanList;
	}
}
