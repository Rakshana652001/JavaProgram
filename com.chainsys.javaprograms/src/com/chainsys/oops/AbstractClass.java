package com.chainsys.oops;

import java.util.Scanner;

public abstract class AbstractClass 
{
	Scanner scan = new Scanner(System.in);
	public abstract void loanIntrestCalculation();
	public void educationLoan()
	{
		ABCBank bankDetails = new ABCBank();
		TestABCBank forEduLoan = new TestABCBank();
		System.out.println("\nEnter your details to get Educational loan");
		bankDetails.setUserName(TestABCBank.validationForName());
		bankDetails.setPhoneNumber(TestABCBank.validationForPhoneNumber());
		bankDetails.setAccountNumber(TestABCBank.generateAccountNumber());
		System.out.println("Account Number: "+TestABCBank.generateAccountNumber());
		System.out.println("Enter your 10th mark(outOf 500): ");
		int tenMark = scan.nextInt();
		System.out.println("Enter your 12th mark(outOf 1200): ");
		int twelthMark = scan.nextInt();
		if(tenMark >= 400 && twelthMark >= 960)
		{
			System.out.println("Your eligible for more than 1 lakh loan amount per year.");
			int loanAmount = 100000;
			System.out.println("Enter Duration of your course: ");
			int duration = scan.nextInt();
			System.out.println("LoantAmount*duration: "+loanAmount*duration);
 			
		}
		else
		{
			System.out.println("Your eligible for less than 1 lakh loan amount per year.");
			System.out.println("Enter your loan amount: ");
			long loanAmount = scan.nextLong();
			System.out.println("Enter Duration of your course: ");
			int duration = scan.nextInt();
			System.out.println("LoantAmount("+loanAmount+")"+"*"+"duration("+duration+"): "+loanAmount*duration);
		}
	}
	public abstract void businessLoan();

}
