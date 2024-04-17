package com.chainsys.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestABCBank 
{
	static String name,bankNumber;
	static String accountNumber;
	static long phoneNumber;
	static int balance, amount;
	static String firstFourNumber;
    static int count = 0;
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
    
    
    
    public static long validationForPhoneNumber()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your phone number: ");
		phoneNumber = scan.nextLong();
		String longToString = Long.toString(phoneNumber);
		Pattern p = Pattern.compile("^[1-10]*$");
		Matcher m = p.matcher(longToString);
		if(m.find())
		{
			System.out.println("Phone number should contain only 10 integers!!!");
			TestABCBank.validationForPhoneNumber();
		}
		return phoneNumber;
		
    }
    
    public static void generateAccountNumber()
    {
    	
    	Scanner scan = new Scanner(System.in);
    	bankNumber = "35561";
    	long getPhoneNumber = TestABCBank.validationForPhoneNumber();
    	String forLength = Long.toString(getPhoneNumber);
    	String forSubString = Long.toString(getPhoneNumber);
    	String forCount = Integer.toString(count);
    	if (forLength.length() > 4)
    	{
    	    firstFourNumber = forSubString.substring(0, 4);
    	    String concat = bankNumber.concat(firstFourNumber).concat(forCount);
    	    count++;
    	    System.out.println(concat);    	    
    	} else {
    		firstFourNumber = forSubString;
    	}    
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
    
    public static int deposite(int balance, long phoneNumber)
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
			TestABCBank.deposite(balance, phoneNumber);
		}
		return balance;

    }
    
    public static int deposite(int balance, String accountNumber)
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
			TestABCBank.deposite(balance, accountNumber);
		}
		return balance;

    }
    
    
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ABCBank bankDetails = new ABCBank();
		bankDetails.setUserName(TestABCBank.validationForName());
		TestABCBank.generateAccountNumber();
		balance = 1000;
		System.out.println("Enter amount for deposite: ");
		amount = scan.nextInt();
		System.out.println("Name: "+bankDetails.getUserName());
		System.out.println("Account Number: "+bankDetails.getAccountNumber());
		System.out.println("Phone number: "+bankDetails.getPhoneNumber());	
		System.out.println("Balance: "+balance);
		bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,amount));
		//bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,phoneNumber));
		//bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,accountNumber));
		System.out.println("After deposite : "+bankDetails.getAmountToDeposite());

		scan.close();
	}

}
