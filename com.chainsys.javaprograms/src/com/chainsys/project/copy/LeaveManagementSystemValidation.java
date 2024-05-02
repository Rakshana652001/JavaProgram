package com.chainsys.project.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeaveManagementSystemValidation 
{
	static LeaveManagementSystemImplementation objectForimplementations = new LeaveManagementSystemImplementation();
	public static String numberValidation(String number1)
	{
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(number1);
		if(m.find())
		{
			return number1;
		}
		else
		{
			System.out.println("Enter 1 or 2\n");
			objectForimplementations.apply();
		}
		return number1;
	}

	public static String firstNameValidation(String employeeName)
	{
		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		Matcher m = p.matcher(employeeName);
		if(m.find())
		{
			return employeeName;
		}
		else
		{
			System.out.println("\nName should contain only alphabets.");
			System.out.println("Eg: Sam,Steve,Tony,Natasha.");
			objectForimplementations.employeeName();
		}
		return employeeName;
	}
	
	public static String lastNameValidation(String lastName)
	{
		Pattern p1 = Pattern.compile("^[\sa-zA-Z]*$");
		Matcher m11 = p1.matcher(lastName);
		if(m11.find())
		{
			return lastName;
		}
		else
		{
			System.out.println("\nLast Name should contain only alphabets like Initials or names.");
			System.out.println("Eg: S, T, N");
			objectForimplementations.employeeName();
		}
		return lastName;
	}
	public static String employeeIdValidation(String id)
	{
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(id);
		if(m.find())
		{
			return id;
		}
		else
		{
			System.out.println("\nIncorrect Id");
			System.out.println("Employee ID should contain 4integers.\nEg: 3556, 3557, 3558..");
			objectForimplementations.employeeID();	
		}
		return id;
	}
	
	public static String contactNumberValidation(String phoneNumber)
	{
		Pattern p = Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(phoneNumber);
		if(m.find())
		{
			return phoneNumber;			
		}
		else
		{
			System.out.println("\nPhone number should contain only 10 integers!!!");
			objectForimplementations.contactNumber();
		}
		return phoneNumber;
	}
	
	public static String emergencyNumberValidation(String emergencyContact)
	{
		Pattern p =Pattern.compile("^\\d{10}$");
		Matcher m = p.matcher(emergencyContact);
		if(m.find())
		{
			return emergencyContact;
		}
		else
		{
			System.out.println("\nPhone number should contain only 10 integers!!!");
			objectForimplementations.emergencyNumber();
		}
		return emergencyContact;
	}
	
	public static void notSameValidation(String emergencyNumber, String contactNumber)
	{
		Pattern p = Pattern.compile(emergencyNumber);
		Matcher m = p.matcher(contactNumber);
		if(m.find())
		{
			System.out.println("Contact Number and Emergency number should not be same.");
			objectForimplementations.emergencyNumber();
		}
		else
		{
			objectForimplementations.emailId();
		}
	}
	
	public static void emailVadidation(String gmail)
	{
		Pattern ps = Pattern.compile("[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,3}$");
		Matcher ms1 = ps.matcher(gmail);
		if(ms1.find())
		{
			objectForimplementations.createPassword();
		}
		else
		{
			System.out.println("\nError!!!");
			System.out.println("Enter valid gmailID:" );
			System.out.println("{No upper case allowed.\nEg: rakshana_2.3@gmail.com}");
			objectForimplementations.emailId();
			
		}
	}
	
	public static String reasonValidation(String num)
	{
		Pattern p = Pattern.compile("^[1-3]$");
		Matcher m = p.matcher(num);
		if(m.find())
		{
			return num;
		}
		else
		{
			objectForimplementations.reasonOfLeave();
		}
		return num;
	}
	
	public static String salaryValidation(String salary)
	{
		Pattern p = Pattern.compile("^\\d+([kw])?\\+?$");
		Matcher m = p.matcher(salary);
		if(m.find())
		{
			return salary;
		}
		else
		{
			System.out.println("Salary want to be in numbers");
			objectForimplementations.totalSalary();
		}
		return salary;
	}
}
