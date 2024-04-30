package com.chainsys.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection 
{
	public static void main(String args []) throws ClassNotFoundException, SQLException
	{
		Connection getConnection = getConnection();
		System.out.println(getConnection);
	}

	static Connection getConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LeaveManagement", "root", "Rakshana@1947");
		return connection;
	}

}
