package com.chainsys.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int id, numberOfDays, months, number;
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
	            Date date = formatting.parse(dateOfLeave);  
	            format = formatting.format(date);  
	         } 
		 catch (ParseException e) 
		 {  
	            System.out.println("Invalid date format");  
	     }
		 return format; 
	}
	
	public static String reasonOfLeave()
	{
		
		System.out.println("Enter your Reason\n1.Emergency\n2.hospitalized\n3.Maternity Leave");
		number = scan.nextInt();
		switch (number)
		{
		case 1:
				leaveReason = "Emergency";
				return leaveReason;
		case 2:
				leaveReason = "Hospitalized";
				return leaveReason;
		case 3:
				leaveReason = "MaternityPeriod";
				return leaveReason;
		}
		return leaveReason;		
	}
	
	public static int numberOfDays()
	{
		if(number == 1 || number == 2)
		{
			System.out.println("Enter number of days: ");
			numberOfDays = scan.nextInt();
			return numberOfDays;
		}
		else
		{
			return 0;
		}
	}
	public static long payOff()
	{
		if(leaveReason == "Emergency")
		{
			if(numberOfDays == 1)
			{
				System.out.println("No Payoff.");
			}
			else if(numberOfDays==2)
			{
				System.out.println("200 PayOff.");
			}
			else if(numberOfDays>3)
			{
				System.out.println("200 PayOff per day.");
			}
			return numberOfDays;
		}
		else if(leaveReason == "Hospitalized")
		{
			if(numberOfDays < 10)
			{
				System.out.println("NoPayoff, Work from home.");
			}
			else if (numberOfDays > 10)
			{
				System.out.println("Payoff detected (50/Day) & Work from home.");
			}
			return numberOfDays;
		}
		else if(leaveReason == "MaternityPeriod")
		{
			months = 6;
			System.out.println("Allowed only for "+months+"months.");
			System.out.println("No Payoff but Work From Home");
			return months;
		}
		return months;
		
		
	}
	public static void main(String[] args) 
	{
		LeaveManagementSystemClass leaveManagementSystem = new LeaveManagementSystemClass();
		leaveManagementSystem.setEmployeeID(LeaveManagementSystemMain.employeeID());
		leaveManagementSystem.setDateOfLeave(LeaveManagementSystemMain.dateOfLeave());
		leaveManagementSystem.setReasonOfLeave(LeaveManagementSystemMain.reasonOfLeave());
		leaveManagementSystem.setNumberOfDays(LeaveManagementSystemMain.numberOfDays());
		System.out.println("\nYour EmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Starting Date of Leave: "+(leaveManagementSystem.getDateOfLeave()));
		System.out.println("Reason for Leave: "+(leaveManagementSystem.getReasonOfLeave()));
		System.out.println("Number of days Leave: "+(leaveManagementSystem.getNumberOfDays()));
		LeaveManagementSystemMain.payOff();
		
		
	}

}
