package com.simplilearn;

import java.sql.*;

public class DBUtil {
	Connection connection = null;

	public DBUtil(String dbURL, String user, String pwd) {
		try {
			// STEP 1 LOAD THE JDBC DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 2 GET THE CONNECTION TO THE DATABSE
			connection = DriverManager.getConnection(dbURL, user, pwd);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void closeConnection() throws SQLException {
		if (this.connection != null)
			this.connection.close();
	}

}