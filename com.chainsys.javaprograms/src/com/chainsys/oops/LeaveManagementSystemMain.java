package com.chainsys.oops;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberOfDaysE, months, number, stringToInt, dayss=5, enterDepartment, pdNumber;
	static String id, passWord,leaveDate, format, leaveReason, employeeName, devoloper, admin, security, accounts, marketing, enterDepartmentIToS;
	static Date dateOfLeave;
	static long phoneNumber, salary, perDaySalary;
	
	public static String dateOfLeave()
	{
		dateOfLeave = new Date();  
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = formatDate.format(dateOfLeave);
		return dateString;
	}
	
	
	public static void login()
	{
		System.out.println("Login");
		System.out.println("``````");
		System.out.print("Enter your employee ID: ");
		id = scan.next();
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(id);
		if(m.find())
		{
			System.out.print("PassWord: ");
			passWord = scan.next();
			Pattern ps = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$");
			Matcher m1 = ps.matcher(passWord);
			if(m1.find())
			{
				System.out.println("Correct Password.\nLogin Successful!!!\n");
			}
			
			else
			{
				System.out.println("Worng Password");
				System.out.println("Password should contain\n1.Minimum 5 characters in length.\n2.Contain Uppercase letter\n3.Lowercase letter\n3.One Special charecter\n4.Numbers");
				System.out.println("Eg, Kim@002, kIm#765, kiM%2313");
				LeaveManagementSystemMain.login();
			}
		}
		
		else
		{
			System.out.println("Login Failed!!!\nEmployee ID should contain only 5 numbers!!!");
			System.out.println("Eg, 3556, 3557, 3558\n");
			LeaveManagementSystemMain.login();
			
		}
		
	}
	
	
	
	public static void personalDetails()
	{
		System.out.println("Application forms");
		System.out.println("``````````````````");;
		System.out.println("1.Fill Personal Details.\n2.Apply for Leave.");
		System.out.print("Fill every page by entering(1/2): ");
		pdNumber = scan.nextInt();
		switch(pdNumber)
		{
			case 1:
				LeaveManagementSystemMain.employeeName();
				LeaveManagementSystemMain.employeeID();
				LeaveManagementSystemMain.contactNumber();
				System.out.println("\n");
				LeaveManagementSystemMain.personalDetails();
				break;
			case 2:
				LeaveManagementSystemMain.reasonOfLeave();
				
		}
	}
	
	public static String employeeName() 
	{
		System.out.println("\nPersonal Details:");
		System.out.println("`````````````````");
		System.out.print("Enter your Name: ");
		employeeName = scan.next();
		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		Matcher m = p.matcher(employeeName);
		if(m.find())
		{
			return employeeName;
		}
		else
		{
			System.out.println("Name should contain only alphabets.");
			System.out.println("Eg, \nSam,Steve,Tony,Natasha.");
			LeaveManagementSystemMain.employeeName();
		}
		return null;
	}
	
	public static int employeeID()
	{
		System.out.print("Enter Your EmployeeID: ");
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
	
	
	
	public static long contactNumber()
	{
		System.out.print("Enter your phone number: ");
		phoneNumber = scan.nextLong();
		String longToString = Long.toString(phoneNumber);
		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(longToString);
		if(m.find())
		{
			return phoneNumber;
		}
		else
		{
			System.out.println("Phone number should contain only 10 integers!!!");
			TestABCBank.validationForPhoneNumber();
		}
		
		return phoneNumber;
	}
	
	
	
	
	public static String reasonOfLeave()
	{
		System.out.println("\nEnter your Reason");
		System.out.println("``````````````````");
		System.out.println("1.Emergency\n2.Sick\n3.Maternity Leave");
		System.out.print("\nEnter(1/2/3): ");
		number = scan.nextInt();
		switch (number)
		{
		case 1:
				System.out.println("Emergency Leave");
				leaveReason = "Emergency";
				System.out.println("Total 5 days, 2days withoutPayoff and 3days withPayoff");
				return leaveReason;
		case 2:
				System.out.println("Sick Leave");
				leaveReason = "Sick";
				System.out.println("Allowed only for 10days, if you take more than ten days payoff + work from home");
				return leaveReason;
		case 3:
				System.out.println("Maternity Period");
				leaveReason = "MaternityPeriod";
				System.out.println("Allowed only for 6months with work from home");
				return leaveReason;
		}
		return leaveReason;
		
	}
	
	
	public static int numberOfDays()
	{
		if(number == 1)
		{
			System.out.print("\nEnter day(1/2/3/4/5): ");
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
			System.out.print("\nEnter number of days: ");
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
	
	
	
	public static String department()
	{
		System.out.println("\nDepartments");
		System.out.println("```````````");
		System.out.print("1.Devoloper\n2.Accounts\n3.Admin\n4.Security\n5.Marketing");
		System.out.println("\nEnter your Department in number(1,2...): ");
		enterDepartment = scan.nextInt();
		switch(enterDepartment)
		{
			case 1:
				devoloper = "Devoloper";
				return devoloper;
			case 2:
				accounts = "Accounts";
				return accounts;
			case 3:
				admin = "Admin";
				return admin;
			case 4:
				security = "Security";
				return security;
			case 5:
				marketing = "Marketing";
				return marketing;
		}
		return accounts;
		
	}
	
	
	public static long totalSalary()
	{
		System.out.println("Enter total salary: ");
		salary = scan.nextLong();
		perDaySalary = (salary/30);
		return perDaySalary;
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
					System.out.println("Payoff for "+numberOfDaysE+" days: "+(perDaySalary*numberOfDaysE));
					break;
				case 4:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					System.out.println("Payoff for "+numberOfDaysE+" days: "+(perDaySalary*numberOfDaysE));
					break;
				case 5:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					System.out.println("Payoff for "+numberOfDaysE+" days: "+(perDaySalary*numberOfDaysE));
					break;
			}
			
			dayss = dayss-numberOfDaysE;
			System.out.println("Remaining days for Emergency leave: "+dayss);
			return dayss;
		}
		
		
		if(leaveReason == "Sick")
		{
			if(numberOfDays < 10)
			{
				System.out.println("Payoff for "+numberOfDays+" detected: "+(perDaySalary*numberOfDays));
			}
			else if (numberOfDays > 10)
			{
				System.out.println("Get Permission from your manager directly.");
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
		System.out.println("Leave Application Form");
		System.out.println("======================\n");
		LeaveManagementSystemMain.login();
		LeaveManagementSystemMain.personalDetails();
		leaveManagementSystem.setEmployeeName(employeeName);
		leaveManagementSystem.setEmployeeID(stringToInt);
		leaveManagementSystem.setContactNumber(phoneNumber);
		leaveManagementSystem.setDateOfLeave(LeaveManagementSystemMain.dateOfLeave());
		leaveManagementSystem.setReasonOfLeave(leaveReason);
		leaveManagementSystem.setNumberOfDays(LeaveManagementSystemMain.numberOfDays());
		LeaveManagementSystemMain.totalSalary();
		leaveManagementSystem.setDepartment(LeaveManagementSystemMain.department());
		System.out.println("\nEmployeeName: "+leaveManagementSystem.getEmployeeName());
		System.out.println("EmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Contact Number: "+(leaveManagementSystem.getContactNumber()));
		System.out.println("Department: "+(leaveManagementSystem.getDepartment()));
		System.out.println("Applied on: "+(leaveManagementSystem.getDateOfLeave()));
		System.out.println("Leave Reason: "+(leaveManagementSystem.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(leaveManagementSystem.getNumberOfDays()));	
		LeaveManagementSystemMain.payOff();
		
	}

}
