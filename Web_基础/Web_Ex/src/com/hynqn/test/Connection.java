package com.hynqn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hynqn.utils.JDBCUtils;

class Connection {

	@Test
	void test() {
		java.sql.Connection connection = JDBCUtils.getConnection();
		System.out.print(connection);
	}
}
