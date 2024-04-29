package com.chainsys.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeaveManagementSystemValidation 
{
	static LeaveManagementSystemImplementation objectForimplementations = new LeaveManagementSystemImplementation();
	public static String numberValidation(String number)
	{
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(number);
		if(m.find())
		{
			return number;
		}
		else
		{
			System.out.println("Enter 1 or 2\n");
			objectForimplementations.apply();
		}
		return number;
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
}
