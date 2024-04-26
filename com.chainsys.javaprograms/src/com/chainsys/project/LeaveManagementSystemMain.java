package com.chainsys.project;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

public class LeaveManagementSystemMain 
{
	static Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberofDaysEmergency, months, number, stringToInt, 
					dayss=5, enterDepartment, pdNumber;
	static String id, idCheck, passWord, passWordC, rePassword, leaveDate, 
	format,	leaveReason, employeeName, lastName,devoloper, admin, security, 
	accounts, marketing, gmail, concat, phoneNumber, emergencyContact, salary;
	static Date dateOfLeave;
	static long  perDaySalary;
	static long stringToint1, stringToint2;
	
	public static void apply()
	{
		System.out.println("Enter(1/2): ");
		String number = scan.next();
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(number);
		if(m.find())
		{
			int stringTonumber = Integer.parseInt(number);
			switch(stringTonumber)
			{
				case 1:
					LeaveManagementSystemMain.signUp();
					break;
				case 2:
					LeaveManagementSystemMain.login();
					break;
			
				default:
					LeaveManagementSystemMain.apply();
			}
		}
		else
		{
			System.out.println("Enter 1 or 2\n");
			LeaveManagementSystemMain.apply();
		}
		
	}
	public static void signUp()
	{
		System.out.println("SignUp");
		System.out.println("```````");
		LeaveManagementSystemMain.employeeName();
		LeaveManagementSystemMain.employeeID();
		LeaveManagementSystemMain.contactNumber();
		LeaveManagementSystemMain.emergencyNumber();
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
			Pattern p1 = Pattern.compile("^[\sa-zA-Z]*$");
			Matcher m11 = p1.matcher(lastName);
			if(m11.find())
			{
				concat = employeeName.concat(lastName);
			}
			else
			{
				System.out.println("\nLast Name should contain only alphabets like Initials or names.");
				System.out.println("Eg: S, T, N");
				LeaveManagementSystemMain.employeeName();
			}
		}
		else
		{
			System.out.println("\nName should contain only alphabets.");
			System.out.println("Eg: Sam,Steve,Tony,Natasha.");
			LeaveManagementSystemMain.employeeName();
		}
		return concat;
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
			System.out.println("Employee ID should contain 4integers.\nEg: 3556, 3557, 3558..");
			LeaveManagementSystemMain.employeeID();
			
		}
		return stringToInt;
	}
	
	
	public static long contactNumber()
	{
		System.out.print("Enter your phone number: ");
		phoneNumber = scan.next();
		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(phoneNumber);
		if(m.find())
		{
			stringToint1 = Long.parseLong(phoneNumber);
			return stringToint1;
		}
		else
		{
			System.out.println("\nPhone number should contain only 10 integers!!!");
			LeaveManagementSystemMain.contactNumber();
		}
		
		return stringToint1;
	}
	
	
	public static long emergencyNumber()
	{
		System.out.print("Emergency contact: ");
		emergencyContact = scan.next();
		Pattern p =Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(emergencyContact);
		if(m.find())
		{
			LeaveManagementSystemMain.notSameNumber();
			stringToint2 = Long.parseLong(emergencyContact);
			return stringToint2;
		}
		else
		{
			System.out.println("\nPhone number should contain only 10 integers!!!");
			LeaveManagementSystemMain.emergencyNumber();
		}
		return stringToint2;
		
	}
	
	
	public static void notSameNumber()
	{
		String emergencyNumber = emergencyContact;
		String contactNumber = phoneNumber;
		Pattern p = Pattern.compile(emergencyNumber);
		Matcher m = p.matcher(contactNumber);
		if(m.find())
		{
			System.out.println("Contact Number and Emergency number should not be same.");
			LeaveManagementSystemMain.emergencyNumber();
		}
		else
		{
			LeaveManagementSystemMain.emailId();
		}
	}
	
	
	
	public static void emailId()
	{
		System.out.print("Enter your EmailId: ");
		gmail = scan.next();
		Pattern ps = Pattern.compile("[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,3}$");
		Matcher ms1 = ps.matcher(gmail);
		if(ms1.find())
		{
			LeaveManagementSystemMain.createPassword();
		}
		else
		{
			System.out.println("\nError!!!");
			System.out.println("Enter valid gmailID:" );
			System.out.println("{No upper case allowed.\nEg: rakshana_2.3@gmail.com}");
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
			System.out.println("Eg: Kim@002, kIm#765, kiM%2313");
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
			LeaveManagementSystemMain.reasonOfLeave();
		}
		
		else
		{
			System.out.println("\nWorng Password!!! Enter correct password.");				
			LeaveManagementSystemMain.password();
		}
	}
	
	
	
	public static String reasonOfLeave()
	{
		System.out.println("\nEnter your Reason");
		System.out.println("``````````````````");
		System.out.println("1.Permission\n2.Sick Leave\n3.Maternity Leave");
		System.out.print("\nEnter(1/2/3): ");
		String num = scan.next();
		Pattern p = Pattern.compile("^[1-3]$");
		Matcher m = p.matcher(num);
		if(m.find())
		{
			number = Integer.parseInt(num);
			switch (number)
			{
			case 1:
					System.out.println("\nPermission");
					leaveReason = "Permission";
					System.out.println("Total 5 days, 2days withoutPayoff and 3days withPayoff");
					return leaveReason;
			case 2:
					
					System.out.println("\nSick Leave");
					leaveReason = "SickLeave";
					System.out.println("Allowed only for 10days.");
					return leaveReason;
			case 3:
					System.out.println("\nMaternity Period");
					leaveReason = "Maternity Period";
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
		String numberToString = Integer.toString(number);
		Pattern p = Pattern.compile("^[1-3]$");
		Matcher m = p.matcher(numberToString);
		if(m.find())
		{
			if(number == 1)
			{
				System.out.print("\nEnter day(1/2/3/4/5): ");
				String number = scan.next();
				Pattern p1 = Pattern.compile("^[1-5]$");
				Matcher m1 = p1.matcher(number);
				numberofDaysEmergency = Integer.parseInt(number);
				if(m1.find())
				{
					Pattern p11 = Pattern.compile("^[3-5]$");
					Matcher m11 = p11.matcher(number);
					if(m11.find())
					{
						LeaveManagementSystemMain.totalSalary();
					}
				}
				else
				{
					LeaveManagementSystemMain.numberOfDays();
				}
				return numberofDaysEmergency;
			}
			else if(number == 2)
			{
				System.out.print("\nEnter number of days: ");
				String numberOfDay = scan.next();
				Pattern p1 =Pattern.compile("\\d");
				Matcher m1 = p1.matcher(numberOfDay);
				if(m1.find())
				{
					numberOfDays = Integer.parseInt(numberOfDay);
					return numberOfDays;
				}
				else
				{
					LeaveManagementSystemMain.reasonOfLeave();
				}
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
		}
		
		return 0;
	}
	
	
	public static long payOff()
	{
		if(leaveReason == "Permission")
		{
			switch(numberofDaysEmergency)
			{
				case 1:
					System.out.println("no payOff");
					break;
				case 2:
					System.out.println("no payOff");
					break;
				case 3:
					LeaveManagementSystemMain.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+numberofDaysEmergency+" days: "+(perDaySalary*numberofDaysEmergency));
					break;
				case 4:
					LeaveManagementSystemMain.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+numberofDaysEmergency+" days: "+(perDaySalary*numberofDaysEmergency));
					break;
				case 5:
					LeaveManagementSystemMain.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+numberofDaysEmergency+" days: "+(perDaySalary*numberofDaysEmergency));
					break;
			}
			
			dayss = dayss-numberofDaysEmergency;
			System.out.println("Remaining days for getting Permission in this month: "+dayss);
			return dayss;
		}
		
		
		if(leaveReason == "SickLeave")
		{
			String numbertoString1 = Integer.toString(numberOfDays);
			Pattern p1 = Pattern.compile("\\b([1-9]|10)\\b");
			Matcher m1 = p1.matcher(numbertoString1);
			if(m1.find())
			{
				System.out.println("No Payoff");
			}
			else
			{
				LeaveManagementSystemMain.endDate();
				System.out.println("Exceded more than 10 days\nGet Permission from your manager directly.");
			}
			return numberOfDays;
		}
		
		
		else if(leaveReason == "Maternity Period")
		{
			months = 6;
			System.out.println("Allowed only for "+months+"months.");
			LeaveManagementSystemMain.endDateMatertiny();
			System.out.println("No Payoff but Work From Home");
			return months;
		}
		
		else
		{
			System.out.println("No leave granted.");
		}
		
	return months;
	
	}
	
	
	public static String department()
	{
		System.out.println("\nDepartments");
		System.out.println("```````````");
		System.out.print("1.Devoloper\n2.Accounts\n3.Admin\n4.Security\n5.Marketing");
		System.out.println("\nEnter your Department in number(1,2...): ");
		String enterDepartment =scan.next();
		Pattern p1 = Pattern.compile("^[1-5]$");
		Matcher m1 = p1.matcher(enterDepartment);
		if(m1.find())
		{
			int department = Integer.parseInt(enterDepartment);
			switch(department)
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
		salary = scan.next();
		Pattern p = Pattern.compile("^\\d+([kw])?\\+?$");
		Matcher m = p.matcher(salary);
		if(m.find())
		{
			long salaryLong = Long.parseLong(salary);
			perDaySalary = (salaryLong/30);
		}
		else
		{
			System.out.println("Salary want to be in numbers");
			LeaveManagementSystemMain.totalSalary();
		}
		return perDaySalary;
	}
	
	
	public static String dateOfLeave()
	{
		dateOfLeave = new Date();  
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatDate.format(dateOfLeave);
		return dateString;
	}	
	
	public static void endDate()
	{
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(numberOfDays);
		System.out.println("Leave End Date: "+tomorrow);
	}
	
	
	public static void endDateE()
	{
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(numberofDaysEmergency);
		System.out.println("Leave End Date: "+tomorrow);
	}

	public static void endDateMatertiny()
	{
		LocalDate now =  LocalDate.now();  
		LocalDate sameDayNextMonth = now.plusMonths(months);
		System.out.println("Leave End Date: "+sameDayNextMonth);
	}
	
	
	public static void main(String[] args) 
	{
		LeaveManagementSystemClass leaveManagementSystem = new LeaveManagementSystemClass();
		System.out.println("Leave Application Form");
		System.out.println("=======================");
		System.out.println("SignUP(1)      Login(2)\n");
		LeaveManagementSystemMain.apply();
		leaveManagementSystem.setEmployeeName(concat);
		leaveManagementSystem.setEmployeeID(stringToInt);
		leaveManagementSystem.setContactNumber(stringToint1);
		leaveManagementSystem.setEmergencyContact(stringToint2);
		leaveManagementSystem.setDateOfLeave(LeaveManagementSystemMain.dateOfLeave());
		leaveManagementSystem.setReasonOfLeave(leaveReason);
		leaveManagementSystem.setNumberOfDays(LeaveManagementSystemMain.numberOfDays());
		leaveManagementSystem.setDepartment(LeaveManagementSystemMain.department());
		System.out.println("\nEmployeeName: "+leaveManagementSystem.getEmployeeName());
		System.out.println("EmployeeID: "+(leaveManagementSystem.getEmployeeID()));
		System.out.println("Contact Number: "+(leaveManagementSystem.getContactNumber()));
		System.out.println("Emergency Contact: "+(leaveManagementSystem.getEmergencyContact()));
		System.out.println("Department: "+(leaveManagementSystem.getDepartment()));
		System.out.println("Applied on: "+(leaveManagementSystem.getDateOfLeave()));
		System.out.println("Leave Reason: "+(leaveManagementSystem.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(leaveManagementSystem.getNumberOfDays()));	
		LeaveManagementSystemMain.payOff();		
	}

}
