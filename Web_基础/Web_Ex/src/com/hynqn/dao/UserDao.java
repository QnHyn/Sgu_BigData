package com.hynqn.dao;

import java.util.List;

import com.hynqn.bean.User;

public interface UserDao {
	// ctrl+shift+o 导包 
	/**
	  * 根据用户名和密码
	 * @param username
	 * @param password
	 * @return user 或者 null
	 */
	User checkUsernameAndPassword(String username , String password);
	/**
	 * 根据用户名查找数据库中是否已经存在用户
	 * @param username
	 * @return true 用户已经存在 false 用户不存在
	 */
	boolean checkUserName(String username);
	/**
	 * 保存用户名密码到数据库中
	 * @param username
	 * @param password
	 * @param email
	 */
	void saveUser(String username, String password, String email);
	List<User> getUsers();
}
