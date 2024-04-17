package com.chainsys.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestABCBank 
{
	static TestABCBank testABCBank = new TestABCBank();
	static Scanner scan = new Scanner(System.in);
	static String name,bankNumber, concat;
	static String accountNumber;
	static long phoneNumber, intrest;
	static int balance=1000, amount, bonus = 5, amountForLoan, percent, time;
	static String firstFourNumber;
    static int count = 1;
    public static String validationForName()
    {
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
    	System.out.println("Enter your phone number: ");
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
    
    
    public static String generateAccountNumber()
    {
    	bankNumber = "35561";
    	String forLengthAndSubString = Long.toString(phoneNumber);
    	String forCount = Integer.toString(count);
    	if (forLengthAndSubString.length() > 4)
    	{
    	    firstFourNumber = forLengthAndSubString.substring(0, 4);
    	    concat = bankNumber.concat(firstFourNumber).concat(forCount);
    	    count++;    
    	} else {
    		firstFourNumber = forLengthAndSubString;
    	}
		return concat;    
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
    
    
    int deposite(int balance, long phoneNumber)
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
			TestABCBank testABCBank = new TestABCBank();
			testABCBank.deposite(balance, phoneNumber);
		}
		return balance;

    }



	public int loanIntrestCalculation()
    {
    	
    	if(balance>0)
    	{
    		System.out.println("ABC bank Loan Intrest Plans");
    		System.out.println("do you intrested to get Loan ?");
    		char getLoan = scan.next().charAt(0);
    		if(getLoan == 'y' || getLoan == 'Y')
    		{
    			System.out.println("Then enter how much loan amount you want!!!");
    			amountForLoan = scan.nextInt();
    			switch(amountForLoan)
    			{
    				case 50000:
    					System.out.println("For 50,000 Interest rate is 5%");
    					percent = (int) (5*50000)/100;
    					time = 12;
    					intrest = 50000+percent*time;
    					System.out.println("Loan amount including intrest"+intrest);
    					break;
    				case 100000:
    					System.out.println("For 1,00,000 Interest rate is 7%");
    					percent = (int) (7*100000)/100;
    					time = 12;
    					intrest = 100000+percent*time;
    					System.out.println("Loan amount including intrest"+intrest);
    					break;
    				default:
    					System.out.println("loan available only 50,000 to 1,00,000");
    			}
    		}
    		else if(getLoan == 'n' || getLoan == 'N')
    		{
    			System.out.println("Thank you!!! If you need any loan please contact us!!!");
    		}
    		else
    		{
    			System.out.println("Enter 'y' or 'n'!!!");
    			testABCBank.loanIntrestCalculation();
    		}
    	}
		return 0;
    }
	public static void main(String[] args) 
	{
		ABCBank bankDetails = new ABCBank();
		bankDetails.setUserName(TestABCBank.validationForName());
		bankDetails.setPhoneNumber(validationForPhoneNumber());;
		bankDetails.setAccountNumber(TestABCBank.generateAccountNumber());
		System.out.println("Enter amount for deposite: ");
		amount = scan.nextInt();
		
		
		System.out.println("Name: "+bankDetails.getUserName());
		System.out.println("Account Number: "+bankDetails.getAccountNumber());
		System.out.println("Phone number: "+bankDetails.getPhoneNumber());	
		System.out.println("Balance: "+balance);
		
		
		bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,amount));
		//bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,phoneNumber));
		//bankDetails.setAmountToDeposite(TestABCBank.deposite(balance,accountNumber));
		//System.out.println("After deposite through phonePay with bonus rupees "+bonus+":"+bankDetails.getAmountToDeposite());
		System.out.println("After deposite : "+bankDetails.getAmountToDeposite());
		testABCBank.loanIntrestCalculation();
	}

}
