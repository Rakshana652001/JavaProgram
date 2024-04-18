package com.chainsys.oops;

public class SBIBank extends TestABCBank 
{
		public void loanIntrestCalculation()
	    {
					ABCBank bankDetails = new ABCBank();
					int getLoan = bankDetails.setGetLoan(1);
	    			System.out.println("SBI bank Home Loan Scheme");
	    			System.out.println("do you intrested to get Loan ?(y/n)");
	        		char yesOrNo = scan.next().charAt(0);
	        		if(yesOrNo == 'y' || yesOrNo == 'Y')
	        		{
	        			System.out.println("Then enter loan amount you want\nEnter(1, 2 or 3)\n1: 20,00,000\n2: 50,00,000\n3: 1,00,00,000");
		    			getLoan = scan.nextInt();
		    			switch(getLoan)
		    			{
		    				case 1:
		    					long monthlyPay = bankDetails.setMonthlyPay(35000);
		    					int time = bankDetails.setTime(30);
		    					long intrest = bankDetails.setIntrest(800000);
		    					long loanAmount = bankDetails.setLoanAmount(2000000);
		    					System.out.println("For 20,00,000 Monthly pay: "+bankDetails.getMonthlyPay());
		    					System.out.println("Time period: "+bankDetails.getTime());
		    					System.out.println("Intrest amount: "+bankDetails.getIntrest());
		    					System.out.println("Loan Amount: "+loanAmount);
		    					long total = (monthlyPay*time)+loanAmount;
		    					System.out.println("Total amount: "+total);
		    					break;
		    					
		    				case 2:
		    					long monthlyPay1 = bankDetails.setMonthlyPay(41000);
		    					int time1 = bankDetails.setTime(30);
		    					long intrest1 = bankDetails.setIntrest(1000000);
		    					long loanAmount1 = bankDetails.setLoanAmount(5000000);
		    					System.out.println("For 50,00,000 Monthly pay: "+bankDetails.getMonthlyPay());
		    					System.out.println("Time period: "+bankDetails.getTime());
		    					System.out.println("Intrest amount: "+bankDetails.getIntrest());
		    					System.out.println("Loan Amount: "+loanAmount1);
		    					total = (monthlyPay1*time1)+loanAmount1;
		    					System.out.println("Total amount: "+total);
		    					break;	
		    				case 3:
		    					long monthlyPay2 = bankDetails.setMonthlyPay(100000);
		    					int time2 = bankDetails.setTime(30);
		    					long intrest2 = bankDetails.setIntrest(2000000);
		    					long loanAmount2 = bankDetails.setLoanAmount(10000000);
		    					System.out.println("For 1,00,00,000 Monthly pay: "+bankDetails.getMonthlyPay());
		    					System.out.println("Time period: "+bankDetails.getTime());
		    					System.out.println("Intrest amount: "+bankDetails.getIntrest());
		    					System.out.println("Loan Amount: "+loanAmount2);
		    					total = (monthlyPay2*time2)+loanAmount2;
		    					System.out.println("Total amount: "+total);
		    					break;
		    				
		    				default:
		    					System.out.println("loan available only 50,00,000 to 1,00,00,000");
		    			}
	        		}
		    		else if( yesOrNo == 'n' || yesOrNo == 'N')
		        	{
		        		System.out.println("Thank you!!! If you need any loan please contact us!!!\n");
		        	}
	        	}
	}
	

