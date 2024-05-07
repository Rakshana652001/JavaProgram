package com.chainsys.test;

import java.sql.SQLException;

import com.chainsys.dao.LeaveManagementSystemImplementation;

public class LeaveManagementSystemMain
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		LeaveManagementSystemImplementation objectForimplementation = new LeaveManagementSystemImplementation();
		System.out.println("Leave Application Form");
		System.out.println("=======================");
		objectForimplementation.implementation();
		objectForimplementation.getterSetter();
		
	}
}

