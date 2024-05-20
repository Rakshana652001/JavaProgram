package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.LeaveManagementSystemClass;
import com.chainsys.util.JdbcConnection;

public class LeaveManagementSystemImplementationManagerSide 
{
	static String employeeIDCheck, managerID;
	static int idChange;
	static Scanner scan = new Scanner(System.in);
	static LeaveManagementSystemClass objectForPojo = new LeaveManagementSystemClass(); 
	static LeaveManagementSystemImplementationManagerSide objectForImplementations = new LeaveManagementSystemImplementationManagerSide();
	static ArrayList<Integer> managerIDList = new ArrayList<Integer>();
	static ArrayList<Integer> exsistingListForID = new ArrayList<Integer>();
	static ArrayList<String> managerPasswordList = new ArrayList<String>();
	
	
	
	public void retrivedData() throws ClassNotFoundException, SQLException 
	{
		Connection getConnection = JdbcConnection.getConnection();
		String select = "select * from leaveManage";
		PreparedStatement preparedStatement = getConnection.prepareStatement(select);
		ResultSet resultSet = preparedStatement.executeQuery();
		System.out.println("Members who applied leave:");
		System.out.println("EmployeeID\tDate Of Leave\tReason Of Leave\t\tNumber Of Days\t\tApproved or not");
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6)+"\n");
		}
		objectForImplementations.login();
		getConnection.close();
	}
	
	
	public void login() throws SQLException, ClassNotFoundException
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter ManagerID: ");
		managerID = scan.next();
		objectForPojo.setManagerID(Integer.parseInt(managerID));
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(managerID);
		if(m.find())
			{
				String select = "select managerID from manager";
				PreparedStatement preparedStatement = getConnection.prepareStatement(select);
				ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next())
				{
					int id = resultSet.getInt(1);
					managerIDList.add(id);
					objectForImplementations.passwordCheck();
				}
				if(managerIDList.contains(objectForPojo.getManagerID()))
				{
					objectForImplementations.idCheck();
				}
				else
				{
					System.out.println("Manager ID not valid");
					objectForImplementations.login();
				}	
			}		
		getConnection.close();
	}
    
	public void passwordCheck() throws ClassNotFoundException, SQLException
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter Password: ");
		String passwordCheck = scan.next();
		Pattern p =Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$");
		Matcher m = p.matcher(passwordCheck);
		if(m.find())
		{
			String selectPassword = "select password from manager";
			PreparedStatement preparedStatement2 = getConnection.prepareStatement(selectPassword);
			ResultSet resultSet2 = preparedStatement2.executeQuery();
			while(resultSet2.next())
			{
				String password = resultSet2.getString(1);
				managerPasswordList.add(password);
				System.out.println("Successfully LoggedIn...\n");
			}
		}
		else
		{
			System.out.println("Invalid Password...");
			objectForImplementations.passwordCheck();
		}
		
		getConnection.close();
	}
	
	
	public  void idCheck() throws ClassNotFoundException, SQLException //check id from array list
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter EmployeeId: ");
		employeeIDCheck = scan.next();
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(employeeIDCheck);
		if(m.find())
		{
			idChange = Integer.parseInt(employeeIDCheck);
			String selectID = "select employeeID from leaveManagement";
			PreparedStatement prepareStatement1 = getConnection.prepareStatement(selectID);
			ResultSet resultSet1 = prepareStatement1.executeQuery();
			while(resultSet1.next())
			{
				int id1 = resultSet1.getInt(1);					
				exsistingListForID.add(id1); //store in array
			}
			if(exsistingListForID.contains(idChange))
			{
				objectForImplementations.leaveApproval();
			}
			else
			{
				System.out.println("Enter only Above employee Id's");
				objectForImplementations.idCheck();
			}
		}
		else
		{
			System.out.println("\nIncorrect Id");
			System.out.println("Employee ID should contain 4integers.\nEg: 3556, 3557, 3558..");	
			objectForImplementations.idCheck();
		}
		getConnection.close();
	}
	
	
	public void leaveApproval() throws ClassNotFoundException, SQLException
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter Approved or Not Approved: ");
		String approve = scan.nextLine();
		if(approve.equals("Approved") || approve.equals("Not Approved"))
		{
			String update = "update leaveManage set approval = ? where employeeID = ?";
			PreparedStatement preparedStatement2 = getConnection.prepareStatement(update);
			preparedStatement2.setString(1, approve);
			preparedStatement2.setInt(2, idChange);
			preparedStatement2.executeUpdate();
			System.out.println("Updated successfully\n");
		}
		
	}
	
	

}
