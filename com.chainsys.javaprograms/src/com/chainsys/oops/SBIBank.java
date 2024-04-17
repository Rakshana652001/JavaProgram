package com.chainsys.oops;

public class SBIBank extends TestABCBank 
{
	char getLoan;
	long loanAmount,monthlyPay;
	public int loanIntrestCalculation()
    {
    			System.out.println("SBI bank Home Scheme");
    			System.out.print("Then enter loan amount you want:");
    			getLoan = scan.next().charAt(0);
    			amountForLoan = scan.nextInt();
    			switch(amountForLoan)
    			{
    				case 5000000:
    					monthlyPay = 41000;
    					time = 30;
    					intrest = 10000000;
    					loanAmount = 15000000;
    					System.out.println("For 50,00,000 Interest amount"+monthlyPay);
    					System.out.println("Intrest amount"+intrest);
    					System.out.println("Total amount"+loanAmount);
    					break;
    					
    				case 10000000:
    					
    					monthlyPay = 100000;
    					time = 30;
    					intrest = 100000000;
    					loanAmount = 150000000;
    					System.out.println("For 1000,00,000 Interest amount"+monthlyPay);
    					System.out.println("Intrest amount"+intrest);
    					System.out.println("Total amount"+loanAmount);
    					break;
    				
    				default:
    					System.out.println("loan available only 50,00,000 to 1,00,00,000");
    			}

		return 0;

}
}
