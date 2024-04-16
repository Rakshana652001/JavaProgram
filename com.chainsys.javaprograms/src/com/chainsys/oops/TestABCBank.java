package com.chainsys.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestABCBank 
{
	static String name;
	static String accountNumber;
	static long phoneNumber;
	static int balance, amount;
    
    public static String validationForName()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your name: ");
		name = scan.next();
		Pattern p = Pattern.compile("^[a-zA-z]*$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			return name;
		}
		else
		{
			System.out.println("Name should contain only alphabets!!!");
			TestABCBank.validationForName();
		}
		return name;
    	
    }
    
   
    
    public static String validationForAccountNumber()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your account number: ");
		accountNumber = scan.next();
		Pattern p = Pattern.compile("^[A-Z0-9]*$");
		Matcher m = p.matcher(accountNumber);
		if(m.find())
		{
			return accountNumber;
		}
		else
		{
			System.out.println("Account number should contain only Upper case Alphabets and numbers!!!");
			TestABCBank.validationForAccountNumber();
		}
		return accountNumber;
    }
    
    public static long validationForPhoneNumber()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your phone number: ");
		phoneNumber = scan.nextLong();
		String longToString = Long.toString(phoneNumber);
		Pattern p = Pattern.compile("[a-zA-Z@#$%^*()!]");
		Matcher m = p.matcher(longToString);
		if(m.find())
		{
			System.out.println("Phone number should contain only 10 integers!!!");
			TestABCBank.validationForPhoneNumber();
		}
		else
		{
			return phoneNumber;
			
		}
		return phoneNumber;
		
    }
    
    public static int deposite(int balance, int amount)
    {
    	
    	if(amount>0)
		{
	    	System.out.println("Deposite amount: "+amount);
			balance = balance + amount;
			return balance;
		}
		else
		{
			System.out.println("Invalid Deposite amount!!!");
			TestABCBank.deposite(balance, amount);
		}
		return balance;

    }
    
    
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ABCBank bankDetails = new ABCBank();
		bankDetails.setUserName(TestABCBank.validationForName());
		bankDetails.setAccountNumber(TestABCBank.validationForAccountNumber());
		bankDetails.setPhoneNumber(TestABCBank.validationForPhoneNumber());
		balance = 1000;
		System.out.println("Enter amount for deposite: ");
		amount = scan.nextInt();
		System.out.println("Name: "+bankDetails.getUserName());
		System.out.println("Account Number: "+bankDetails.getAccountNumber());
		System.out.println("Phone number: "+bankDetails.getPhoneNumber());	
		System.out.println("Balance: "+balance);
		bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,amount));
		System.out.println("After deposite : "+bankDetails.getAmountToDeposite());
	}

}
