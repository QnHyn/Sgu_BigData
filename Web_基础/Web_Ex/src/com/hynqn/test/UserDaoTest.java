package com.hynqn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.hynqn.bean.User;
import com.hynqn.dao.UserDao;
import com.hynqn.dao.impl.UserDaoImpl;

class UserDaoTest {
	// 前面写接口类型 后面写实例 多态的写法
	UserDao userDao = new UserDaoImpl();

	@Test
	void testCheckUsernameAndPassword() {
		User user = userDao.checkUsernameAndPassword("admin", "123416");
		System.out.println(user);
	}
	
	@Test
	void checkUserName(){
		boolean flag = userDao.checkUserName("admin1");
		System.out.println(flag);
	}
	
	@Test
	void saveUser(){
		userDao.saveUser("admin1","123456","1wrw@qq.com");
	}
	
	@Test
	void  testgetUsers() {
		List<User> users = userDao.getUsers();
		for(User user : users){
			System.out.println(user);
		}
	}
}
