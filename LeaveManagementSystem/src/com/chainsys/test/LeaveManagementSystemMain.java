package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.dao.LeaveManagementSystemImplementation;
import com.chainsys.dao.LeaveManagementSystemImplementationManagerSide;

public class LeaveManagementSystemMain
{
	static Scanner scan = new Scanner(System.in);
	static LeaveManagementSystemMain leaveManagementSystemMain = new LeaveManagementSystemMain();
	static LeaveManagementSystemImplementation objectForimplementation = new LeaveManagementSystemImplementation();
	static LeaveManagementSystemImplementationManagerSide objectForImplementationManagerSide = new LeaveManagementSystemImplementationManagerSide();
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		System.out.println("Leave Application Form");
		System.out.println("=======================");
		leaveManagementSystemMain.mainCall();
	}
	
	public void mainCall() throws ClassNotFoundException, SQLException
	{
		System.out.println("Enter your are Employee or Manager(1/2): ");
		String number = scan.next();
		Pattern p = Pattern.compile("^[1-2]$");
		Matcher m = p.matcher(number);
		if(m.find())
		{
			int stringToNumber = Integer.parseInt(number);
			if(stringToNumber==1)
			{
				objectForimplementation.implementation();
			}
			else if(stringToNumber==2)
			{
				objectForImplementationManagerSide.retrivedData();
				objectForImplementationManagerSide.leaveApproval();
			}
			else
			{
				System.out.println("Enter your are Employee or Manager(1/2): ");
				leaveManagementSystemMain.mainCall();
			}
		}
		else
		{
			leaveManagementSystemMain.mainCall();
		}
	}
}