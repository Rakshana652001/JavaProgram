package com.chainsys.project;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberOfDaysE, months, number, stringToInt, dayss=5, enterDepartment, pdNumber;
	static String id, idCheck, passWord, passWordC,rePassword, leaveDate, format, leaveReason, employeeName, lastName,devoloper, admin, security, accounts, marketing, gmail, concat;
	static Date dateOfLeave;
	static long phoneNumber, emergencyContact, salary, perDaySalary;
	
	
	public static String dateOfLeave()
	{
		dateOfLeave = new Date();  
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = formatDate.format(dateOfLeave);
		return dateString;
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
			System.out.println("\nIncorrect Id");
			System.out.println("Employee ID should contain 4integers.\nEg, 3556, 3557, 3558..");
			LeaveManagementSystemMain.employeeID();
			
		}
		return stringToInt;
	}
	
	public static void signUp()
	{
		System.out.println("SignUp");
		System.out.println("```````");
		LeaveManagementSystemMain.employeeName();
		LeaveManagementSystemMain.employeeID();
		LeaveManagementSystemMain.contactNumber();
		LeaveManagementSystemMain.emailId();
	}
	
	public static void emailId()
	{
		System.out.print("Enter your EmailId: ");
		gmail = scan.next();
		Pattern ps = Pattern.compile("[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,3}");
		Matcher ms1 = ps.matcher(gmail);
		if(ms1.find())
		{
			LeaveManagementSystemMain.createPassword();
		}
		else
		{
			System.out.println("\nError!!!");
			System.out.println("Enter valid gmailID:" );
			System.out.println("{No upper case allowed.\nEg, rakshana_2.3@gmail.com}");
			LeaveManagementSystemMain.emailId();
			
		}
	}
	public static String createPassword()
	{
		System.out.print("Create PassWord: ");
		passWordC = scan.next();
		Pattern ps = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$");
		Matcher m1 = ps.matcher(passWordC);
		if(m1.find())
		{
			System.out.print("ReEnter password: ");
			rePassword = scan.next();
			Pattern rePass = Pattern.compile(passWordC);
			Matcher rem1 = rePass.matcher(rePassword);
			if(rem1.find())
			{
				System.out.println("Successfully SignedUP!!!");
				LeaveManagementSystemMain.login();

			}
			else
			{
				System.out.println("\nYour PassWord and RePassWord is not matching.");
				LeaveManagementSystemMain.createPassword();
			}
		}
		else
		{
			System.out.println("\nPassword should contain\n1.Minimum 5 characters in length.\n2.Contain Uppercase letter\n3.Lowercase letter\n3.One Special charecter\n4.Numbers");
			System.out.println("Eg, Kim@002, kIm#765, kiM%2313");
			LeaveManagementSystemMain.createPassword();
		}
		
		return rePassword;
	}
	public static int login()
	{
		System.out.println("\nLogin");
		System.out.println("``````");
		System.out.print("Enter your employee ID: ");
		idCheck = scan.next();
		String empID = Integer.toString(stringToInt);
		Pattern p = Pattern.compile(empID);
		Matcher m = p.matcher(idCheck);
		if(m.find())
		{
			LeaveManagementSystemMain.password();
		}
		
		else
		{
			System.out.println("\nLogin Failed!!! Enter correct employeeID.");
			LeaveManagementSystemMain.login();
			
		}
		stringToInt = Integer.parseInt(id);
		return stringToInt;
	}
	
	public static void password()
	{
		System.out.print("PassWord: ");
		passWord = scan.next();
		String rePassword1 = rePassword;
		Pattern ps = Pattern.compile(rePassword1);
		Matcher m1 = ps.matcher(passWord);
		if(m1.find())
		{
			System.out.println("Correct Password.\nLogin Successful!!!\n");
		}
		
		else
		{
			System.out.println("\nWorng Password!!! Enter correct password.");				
			LeaveManagementSystemMain.password();
		}
	}
	
	public static void personalDetails()
	{
		System.out.println("Application forms");
		System.out.println("``````````````````");;
		System.out.println("1.Apply for Leave");
		System.out.print("\nEnter 1 to apply for leave: ");
		pdNumber = scan.nextInt();
		if(pdNumber == 1)
		{
			LeaveManagementSystemMain.reasonOfLeave();
		}
		else
		{
			LeaveManagementSystemMain.personalDetails();
		}
	}
	
	public static String employeeName() 
	{
		System.out.println("Personal Details:");
		System.out.println("`````````````````");
		System.out.print("Enter your First Name: ");
		employeeName = scan.next();
		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		Matcher m = p.matcher(employeeName);
		if(m.find())
		{
			System.out.print("Enter your Last Name: ");
			lastName = scan.next();
			Pattern p1 = Pattern.compile("^[a-zA-Z]*$");
			Matcher m11 = p1.matcher(lastName);
			if(m11.find())
			{
				concat = employeeName.concat(lastName);
			}
			else
			{
				System.out.println("\nLast Name should contain only alphabets like Initials or names.");
				System.out.println("Eg, \n S, T, N");
				LeaveManagementSystemMain.employeeName();
			}
		}
		else
		{
			System.out.println("\nName should contain only alphabets.");
			System.out.println("Eg, \nSam,Steve,Tony,Natasha.");
			LeaveManagementSystemMain.employeeName();
		}
		return concat;
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
			System.out.println("\nPhone number should contain only 10 integers!!!");
			LeaveManagementSystemMain.contactNumber();
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
		if(number<=3)
		{
			switch (number)
			{
			case 1:
					System.out.println("\nEmergency Leave");
					leaveReason = "Emergency";
					System.out.println("Total 5 days, 2days withoutPayoff and 3days withPayoff");
					return leaveReason;
			case 2:
					System.out.println("\nSick Leave");
					leaveReason = "Sick";
					System.out.println("Allowed only for 10days, \nif you take more than ten days payoff + work from home");
					return leaveReason;
			case 3:
					System.out.println("\nMaternity Period");
					leaveReason = "MaternityPeriod";
					System.out.println("Allowed only for 6months with work from home");
					return leaveReason;
			}
		}
		else
		{
			LeaveManagementSystemMain.reasonOfLeave();
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
		if(enterDepartment <= 5)
		{
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
		else
		{
			LeaveManagementSystemMain.department();
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
	
	
	public static void emergencyNumber()
	{
		System.out.println("Emergency contact: ");
		emergencyContact = scan.nextLong();
		String emergencyContactS = Long.toString(emergencyContact);
		Pattern p =Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(emergencyContactS);
		if(m.find())
		{
			System.out.println("Emergency contact: "+emergencyContact);
		}
		else
		{
			System.out.println("\nPhone number should contain only 10 integers!!!");
			LeaveManagementSystemMain.emergencyNumber();
		}
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
					LeaveManagementSystemMain.totalSalary();
					System.out.println("Payoff for "+numberOfDaysE+" days: "+(perDaySalary*numberOfDaysE));
					break;
				case 4:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					LeaveManagementSystemMain.totalSalary();
					System.out.println("Payoff for "+numberOfDaysE+" days: "+(perDaySalary*numberOfDaysE));
					break;
				case 5:
					System.out.println("You exceded more than 2 days in this month for emergency leave");
					LeaveManagementSystemMain.totalSalary();
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
				System.out.println("No Payoff");
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
		System.out.println("              Leave Application Form");
		System.out.println("              ======================\n");
		LeaveManagementSystemMain.signUp();
		LeaveManagementSystemMain.personalDetails();
		leaveManagementSystem.setEmployeeName(concat);
		leaveManagementSystem.setEmployeeID(stringToInt);
		leaveManagementSystem.setContactNumber(phoneNumber);
		leaveManagementSystem.setDateOfLeave(LeaveManagementSystemMain.dateOfLeave());
		leaveManagementSystem.setReasonOfLeave(leaveReason);
		leaveManagementSystem.setNumberOfDays(LeaveManagementSystemMain.numberOfDays());
		leaveManagementSystem.setDepartment(LeaveManagementSystemMain.department());
		System.out.println("\nEmployeeName: "+leaveManagementSystem.getEmployeeName());
		System.out.println("EmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Contact Number: "+(leaveManagementSystem.getContactNumber()));
		System.out.println("Department: "+(leaveManagementSystem.getDepartment()));
		System.out.println("Applied on: "+(leaveManagementSystem.getDateOfLeave()));
		System.out.println("Leave Reason: "+(leaveManagementSystem.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(leaveManagementSystem.getNumberOfDays()));	
		LeaveManagementSystemMain.payOff();
		LeaveManagementSystemMain.emergencyNumber();

		
	}

}
