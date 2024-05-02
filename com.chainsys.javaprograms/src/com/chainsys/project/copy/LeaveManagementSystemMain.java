package com.chainsys.project.copy;

import java.sql.SQLException;

public class LeaveManagementSystemMain
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		LeaveManagementSystemImplementation objectForimplementation = new LeaveManagementSystemImplementation();
		System.out.println("Leave Application Form");
		System.out.println("=======================");
		System.out.println("SignUP(1)      Login(2)\n");
		objectForimplementation.implementation();
	}
	
}

