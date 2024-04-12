package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.*;

public class EmailIdCheck

{
	

	public static String emailValidation()
	{
		Scanner scan = new Scanner(System.in);
		String gmail = scan.next();
		Pattern p = Pattern.compile("[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,3}");
		Matcher m = p.matcher(gmail);
		
		if(m.find())
		{
			System.out.println("Valid");
			
			
		}
		else
		{
			System.out.println("Error!!!");
			System.out.println("Enter valid gmailID:" );
			System.out.println("{No upper case allowed.\nEg, rakshana_2.3@gmail.com}");
			String getEmail = EmailIdCheck.emailValidation();
			
		}
		return gmail;
		
	}
	
	public static String passwordValidation()
	{
		Scanner scan = new Scanner(System.in);
		String passWord = scan.next();
		Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
		Matcher m = p.matcher(passWord);
		if(m.find())
		{
			System.out.println("Valid");
			
			return passWord;
		}
		else
		{
			System.out.println("Error!!!");
			System.out.println("your password should contain: \n1)Upper case letter\n2)Special charecter\n3)Number");
			EmailIdCheck.passwordValidation();
			return null;
		}
		
	}
	
	public static String mobileNumberValidation()
	{
		Scanner scan = new Scanner(System.in);
		String phoneNumber = scan.next();
		Pattern p = Pattern.compile("^[789]\\d{9}$");
		Matcher m = p.matcher(phoneNumber);
		if(m.find())
		{
			System.out.println("Valid");
			return phoneNumber;
		}
		else
		{
			int notValid = 1;
			if(notValid == 1)
			{
				System.out.println("Error!!!");
				System.out.println("Enter valid phone number:");
				System.out.println("eg: 8235473328\n9231247463\n7232847832");
				String getPhoneNumber = EmailIdCheck.mobileNumberValidation();
				
			}
			return null;
			
		}
		
		
	}
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gmailID:" );
		String getEmail = EmailIdCheck.emailValidation();
		System.out.println("Enter your password:" );
		String getPassword = EmailIdCheck.passwordValidation();
		System.out.println("Enter your phone number:");
		String getPhoneNumber = EmailIdCheck.mobileNumberValidation();
		
	}
	//validation completed

}

