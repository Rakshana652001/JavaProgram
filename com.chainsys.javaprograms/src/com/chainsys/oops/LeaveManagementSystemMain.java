package com.chainsys.oops;


import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberOfDaysE, months, number, stringToInt, dayss=5;
	static String id, leaveDate, format, leaveReason;
	static Date dateOfLeave;
	
	public static int employeeID()
	{
		System.out.println("Enter Your EmployeeID: ");
		id = scan.next();
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(id);
		if(m.find())
		{
			stringToInt = Integer.parseInt(id);
			return stringToInt;
		}
		else
		{
			System.out.println("Employee ID should contain only 5 numbers!!!");
			System.out.println("Eg, 3556, 3557, 3558");
			LeaveManagementSystemMain.employeeID();
			
		}
		return stringToInt;
	}
	
	
	public static String dateOfLeave()
	{
		dateOfLeave = new Date();  
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = formatDate.format(dateOfLeave);
		return dateString;
	}
		
	
	
	public static String reasonOfLeave()
	{
		
		System.out.println("\nEnter your Reason\n1.Emergency (Total 5 days, 2days withoutPayoff and 3days withPayoff)\n2.Hospitalized(Allowed only for 10days)\n3.Maternity Leave(Allowed only for 6months with work from home)");
		System.out.println("\nEnter:1/2/3");
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
		if(number == 1)
		{
			System.out.println("Enter day(1/2/3/4/5):");
			numberOfDaysE = scan.nextInt();
			if(numberOfDaysE>5)
			{
				System.out.println("Emergency leave only for 5 days.");
				LeaveManagementSystemMain.numberOfDays();
			}
			else
			{
				return numberOfDaysE;
			}
			return numberOfDaysE;
		}
		else if(number == 2)
		{
			System.out.println("Enter number of days: ");
			numberOfDays = scan.nextInt();
			return numberOfDays;
		}
		else if(number == 3)
		{
			return 0;
		}
		else
		{
			System.out.println("Invalid Reason!!!");
		}
		return 0;
	}
	
	
	
	
	public static long payOff()
	{
		if(leaveReason == "Emergency")
		{
			switch(numberOfDaysE)
			{
				case 1:
					System.out.println("no payOff");
					break;
				case 2:
					System.out.println("no payOff");
					break;
				case 3:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					System.out.println("Payoff will be detected 50/day");
					break;
				case 4:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					System.out.println("Payoff will be detected 50/day.");
					break;
				case 5:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					System.out.println("Payoff will be detected 50/day.");
					break;
			}
			
			dayss = dayss-numberOfDaysE;
			System.out.println("Remaining days for Emergency leave: "+dayss);
			return dayss;
		}
		
		
		if(leaveReason == "Hospitalized")
		{
			if(numberOfDays < 10)
			{
				System.out.println("Payoff detected (50/Day)");
			}
			else if (numberOfDays > 10)
			{
				System.out.println("Get Permission from your manager.");
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
		
		else
		{
			System.out.println("No leave granted.");
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
		System.out.println("\nEmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Applied on: "+(leaveManagementSystem.getDateOfLeave()));
		System.out.println("Leave Reason: "+(leaveManagementSystem.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(leaveManagementSystem.getNumberOfDays()));	
		LeaveManagementSystemMain.payOff();
		
	}

}
