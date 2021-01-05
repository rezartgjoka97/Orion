package com.servletangular.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getNewConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/orion_db", "root", "good");
	}
	
	
}
