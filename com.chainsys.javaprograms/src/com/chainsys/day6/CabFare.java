package com.chainsys.day6;

import java.util.Scanner;
import java.util.regex.*;

public class CabFare 
{
	public static double amount;
	public static double finalAmount;
	public static double finalAmountCouponDiscount;
	public static int carKm()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the KiloMeter: "); 
		int kiloMeter = scan.nextInt();
		if(kiloMeter <= 0)
		{
			System.out.println("Invalid!!!");
			
		}
		
		return kiloMeter;		
	}
	
	public static double amountDeclaration()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String userName = scan.next();
		double km = CabFare.carKm();
		double micro,mini,prime;
		System.out.println("Enter your cab type: ");
		String cabType = scan.next();
		System.out.println("User name: "+userName);
		if(km <= 0)
		{
			System.out.println("Error!!");
		}
		else
		{
			switch (cabType)
			{
				case "micro":
					micro = km*10;
					amount = micro;
					System.out.println("Amount: "+micro);
					break;
				case "mini":
					mini = km*15;
					amount = mini;
					System.out.println("Amount: "+mini);
					break;
				case "prime":
					prime = km*20;
					amount = prime;
					System.out.println("Amount: "+prime);
					break;
				default :
					System.out.println("Invalid!!!");
			}
			
		}
		System.out.println("Cab type: "+cabType);
		return amount;		
		
				
	}
	public static double  discountCalculation(double amount)
	{
		double twoPercent, fivePercent;
		if(amount >= 2000 && amount < 5000)
		{
			twoPercent = (2*amount)/100;
			System.out.println("2% is discounted, discounted amount: "+twoPercent);
			finalAmount = amount - twoPercent;
			System.out.println("Final Amount: "+finalAmount);
		}
		else if(amount >= 5000 )
		{
			fivePercent = (5*amount)/100;
			System.out.println("5% is discounted, discounted amount: "+fivePercent);
			finalAmount = amount - fivePercent;
			System.out.println("Final Amount: "+finalAmount);
		}
		return finalAmount;
	}
	public static void couponCodeDiscount(double finalAmount)
	{
		double twoPercentForCoupon,fivePercentForCoupon;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter coupon code if you have: ");
		int coupon = scan.nextInt();
		if(coupon != 2 && coupon != 5)
		{
			System.out.println("Invalid coupon code!!!");
		}
		else
		{
			switch (coupon)
			{
			case 2:
				twoPercentForCoupon = (2*finalAmount)/100;
				System.out.println("2% is discounted for Coupon code, discounted amount: "+twoPercentForCoupon);
				finalAmountCouponDiscount = finalAmount - twoPercentForCoupon;
				System.out.println("Final amount After coupon discount: "+finalAmountCouponDiscount);
				break;
			case 5:
				fivePercentForCoupon = (5*finalAmount)/100;
				System.out.println("5% is discounted for Coupon code, discounted amount: "+fivePercentForCoupon);
				finalAmountCouponDiscount = finalAmount - fivePercentForCoupon;
				System.out.println("Final amount After coupon discount: "+String.format("%.2f", finalAmountCouponDiscount));
				break;
			}
		}
		
		
	}
	
	public static void main (String[] args)
	{
		CabFare getAmount = new CabFare();
		getAmount.amountDeclaration();
		CabFare discountedAmount = new CabFare();
		CabFare.discountCalculation(amount);
		CabFare getCouponDiscount = new CabFare();
		getCouponDiscount.couponCodeDiscount(finalAmount);
		
		
	
		
	}

}
