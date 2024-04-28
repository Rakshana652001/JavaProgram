package com.chainsys.project;


public class LeaveManagementSystemMain
{
	
	public static void main(String[] args) 
	{
		LeaveManagementSystemImplementation objectForimplementation = new LeaveManagementSystemImplementation();

		System.out.println("Leave Application Form");
		System.out.println("=======================");
		System.out.println("SignUP(1)      Login(2)\n");
		objectForimplementation.implementation();
	}

}

