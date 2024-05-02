//package com.chainsys.project.copy;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import com.chainsys.connection.JdbcConnection;
//
//public class LeaveManagementSystemJdbcConnection
//{
//	static LeaveManagementSystemClass pojoObject = new LeaveManagementSystemClass();
//	static LeaveManagementSystemJdbcConnection connectionObject = new LeaveManagementSystemJdbcConnection();
//	static LeaveManagementSystemImplementation implementationObject = new LeaveManagementSystemImplementation();
//	static String insert, insertEmployeeName;
//	static LeaveManagementSystemClass leaveManagement = new LeaveManagementSystemClass();
//	static int numberOfDays, numberofDaysEmergency, months, number, stringToInt, 
//	dayss=5, enterDepartment, pdNumber, number1ToString;
//	static String id, idCheck, passWord, passWordC, rePassword, leaveDate, 
//	format,	leaveReason, employeeName, lastName,devoloper, admin, security, 
//	accounts, marketing, gmail, concat, phoneNumber, emergencyContact, salary;
//	static Date dateOfLeave; static long  perDaySalary;	static long stringToint1, stringToint2;
////
//	
//	
////	public void save(LeaveManagementSystemClass leaveManagement) throws SQLException
////	{
////		try
////		{
////			Connection getConnection = JdbcConnection.getConnection();
////			System.out.println(getConnection);
////			
////			insert = "insert into leaveManagement(sNo,employeeID, employeeName, contactNumber)values(?,?,?,?)";
////			PreparedStatement prepareStatement = getConnection.prepareStatement(insert);
////			prepareStatement.setInt(1, leaveManagement.sNo);
////            prepareStatement.setInt(2, leaveManagement.employeeID);
//            pojoObject.setEmployeeID(employeeID);
//			prepareStatement.setString(3, leaveManagement.employeeName);
//			pojoObject.setEmployeeName(employeeName);
//			prepareStatement.setLong(4, leaveManagement.contactNumber);
//			pojoObject.setContactNumber(contactNumber);
//			int rows = prepareStatement.executeUpdate();
//			System.out.println(rows);
//		}
//		catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//			
//	}
//	
//	
////	public List<LeaveManagementSystemClass> leaveManagementSystem() throws ClassNotFoundException, SQLException
////	{
////		Connection getConnection = JdbcConnection.getConnection();
////		String selectQuery = "select sNo, employeeID, employeeName, contactNumber from leaveManagement";
////		PreparedStatement prepareStatement = getConnection.prepareStatement(selectQuery);
////		
////		ArrayList<LeaveManagementSystemClass> list = new ArrayList();
////		ResultSet resultSet = prepareStatement.executeQuery();
////		while(resultSet.next())
////		{
////			int sNo = resultSet.getInt("sNo");
////			int employeeID = resultSet.getInt("employeeID");
////			String employeeName = resultSet.getString("employeeName");
////			long contactNumber = resultSet.getLong("contactNumber");
////			
////			leaveManagement.setsNo(sNo);
////			leaveManagement.setEmployeeID(employeeID);
////			leaveManagement.setEmployeeName(employeeName);
////			leaveManagement.setContactNumber(contactNumber);
////			
////			list.add(leaveManagement);
////		}
////		return list;
////	}
////	
////	
////	
////	public static boolean login() throws ClassNotFoundException, SQLException
////	{
////		ArrayList existingList = new ArrayList();
////		Connection getConnection = JdbcConnection.getConnection();
////		String selectQuery = "select employeeName from leaveManagement";
////		PreparedStatement prepareStatement = getConnection.prepareStatement(selectQuery);
////		ResultSet resultSet = prepareStatement.executeQuery();
////		while(resultSet.next())
////		{
////			String employeeName = resultSet.getString("employeeName");
////			existingList.add(employeeName);
////		}
////		if(existingList.contains(leaveManagement.employeeName))
////		{
////			System.out.println("name already exist");
////            return true;
////		}
////		else
////		{
////			System.out.println("Name available for login");
////			String selectQuery1 = "insert into leaveManagement(sNo,employeeID, employeeName, contactNumber)values(?,?,?,?)";
////	            PreparedStatement prepareStatement1 = getConnection.prepareStatement(selectQuery1);
////	            prepareStatement1.setInt(1, leaveManagement.sNo);
////	            
////	            prepareStatement1.setInt(2, pojoObject.getEmployeeID());
////				prepareStatement1.setString(3, pojoObject.getEmployeeName());
////				prepareStatement1.setLong(4, pojoObject.getContactNumber());
////				//int rows = prepareStatement1.executeUpdate();
////	           
////	            return false;
////		}
////		
////	}
////	
////	
////	
////	
//	
//	
//	public static void employeeName() throws ClassNotFoundException, SQLException
//	{
//		Connection getConnection = JdbcConnection.getConnection();
//		System.out.println("Table Connected.    "+getConnection);
//		pojoObject.setEmployeeID(3333);
//		pojoObject.setEmployeeName("Rakshana");
//		pojoObject.setContactNumber(733926388);
//		pojoObject.setEmergencyContact(894054304);
//		pojoObject.setDepartment("Devoploper");
//		pojoObject.setReasonOfLeave("Sick");
//		pojoObject.setDateOfLeave("2024-05-05");
//		pojoObject.setNumberOfDays(10);
//		insertEmployeeName = "insert into leaveManagement(employeeID, employeeName, contactNumber, emergencyContact, department, dateOfLeave, reasonOfLeave, numberOfDays)values(?,?,?,?,?,?,?,?)";
//		PreparedStatement prepareStatement = getConnection.prepareStatement(insertEmployeeName);
//        prepareStatement.setInt(1, pojoObject.getEmployeeID());
//		prepareStatement.setString(2, pojoObject.getEmployeeName());
//		prepareStatement.setLong(3, pojoObject.getContactNumber());
//		prepareStatement.setLong(4, pojoObject.getEmergencyContact());
//		prepareStatement.setString(5, pojoObject.getDepartment());
//		prepareStatement.setString(6, pojoObject.getDateOfLeave());
//		prepareStatement.setString(7, pojoObject.getReasonOfLeave());
//		prepareStatement.setInt(8, pojoObject.getNumberOfDays());
//		int rows = prepareStatement.executeUpdate();
//		System.out.println("EmployeName Inserted: "+rows);
//		
//		
//		
//	}
//	
//	public static void main (String [] args) throws ClassNotFoundException, SQLException
//	{
////		LeaveManagementSystemJdbcConnection.employeeID();
//		LeaveManagementSystemJdbcConnection.employeeName();
//		//LeaveManagementSystemJdbcConnection.login();
//
//	}
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public static void employeeID() throws ClassNotFoundException, SQLException
////{
////	Connection getConnection = JdbcConnection.getConnection();
////	System.out.println("EmployeeName Connected.    "+getConnection);
////	int employeeID = implementationObject.employeeID();
////	insert = "insert into leaveManagement(employeeID)values(employeeID)";
////	PreparedStatement prepareStatement = getConnection.prepareStatement(insert);
////	int employeeID1 = prepareStatement.executeUpdate();
////	System.out.println("EmployeId Inserted: "+employeeID1);
////	
////}
//
//
//
