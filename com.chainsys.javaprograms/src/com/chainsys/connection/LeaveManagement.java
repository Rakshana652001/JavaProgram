package com.chainsys.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaveManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//LeaveManagement.insert();
		LeaveManagement.update();
		//LeaveManagement.delete();
        
//        LeaveManagement leaveManagement = new LeaveManagement();
//        LeaveManagementPojo leaveManagementPojo = new LeaveManagementPojo();
//        
		
		// TODO Auto-generated method stub

	}
	
	private static void delete() throws ClassNotFoundException, SQLException 
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println(getConnection);
		String delete = "delete from leaveManagement where employeeID=3;";
		PreparedStatement prepareStatement = getConnection.prepareStatement(delete);
		int save2 = prepareStatement.executeUpdate();
	System.out.println(save2);
		// TODO Auto-generated method stub
		
	}

	public static void insert() throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Connection getconnection = JdbcConnection.getConnection();
		System.out.println(getconnection);
		String insert = "insert into leaveManagement(employeeName, contactNumber, emergencyContact)values('Stark', 7294728415,2840374925)";
		PreparedStatement prepareStatement = getconnection.prepareStatement(insert);
		int save = prepareStatement.executeUpdate();
		
		System.out.println(save);
		
	}
	
	public static void update() throws SQLException, ClassNotFoundException
	{
		Connection getconnection = JdbcConnection.getConnection();
		String update = "update leaveManagement set employeeID = 3 where employeeName = 'Stark'";
		PreparedStatement prepareStatement = getconnection.prepareStatement(update);
		int save1 = prepareStatement.executeUpdate();
		System.out.println(save1);
	}
	
	

}
