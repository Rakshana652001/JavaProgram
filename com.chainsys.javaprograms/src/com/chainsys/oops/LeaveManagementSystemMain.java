package com.chainsys.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int id;
	static String leaveDate, format, leaveReason;
	
	public static int employeeID()
	{
		System.out.println("Enter Your EmployeeID: ");
		id = scan.nextInt();
		return id;
		
	}
	public static String dateOfLeave()
	{
		System.out.print("Enter a date (dd/mm/yyyy): ");  
		String dateOfLeave = scan.next();
		SimpleDateFormat formatting = new SimpleDateFormat("dd/MM/yyyy");  
		 try {  
	            Comparable<java.util.Date> date = formatting.parse(dateOfLeave);  
	            format = formatting.format(date);  
	        } catch (ParseException e) {  
	            System.out.println("Invalid date format");  
	        }
		return format; 
	}
	
	public static String reasonOfLeave()
	{
		System.out.println("Enter The reason of Leave: ");
		leaveReason =scan.next();
		
		return leaveReason;
		
	}
	
	
	public static void main(String[] args) 
	{
		LeaveManagementSystemClass leaveManagementSystem = new LeaveManagementSystemClass();
		leaveManagementSystem.setEmployeeID(LeaveManagementSystemMain.employeeID());
		leaveManagementSystem.setDateOfLeave(LeaveManagementSystemMain.dateOfLeave());
		leaveManagementSystem.setReasonOfLeave(LeaveManagementSystemMain.reasonOfLeave());
		System.out.println("Your EmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Date of Leave: "+(leaveManagementSystem.getDateOfLeave()));
		
	}

}
