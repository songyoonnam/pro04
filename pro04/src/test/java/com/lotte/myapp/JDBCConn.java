package com.lotte.myapp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCConn {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
			Logger.info("오라클 연결 성공");
			
		} catch(Exception e) {
			fail("Not yet implemented");
		}
		
	}

}
