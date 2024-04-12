package com.chainsys.day3;

import java.util.Scanner;

public class DiscountInPurchased {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int product1quandity,product2quandity, 
		            product3quandity, product4quandity, product5quandity;
		double total, discount;
		System.out.println("Enter the Quatities of the product: ");
		product1quandity = sc.nextInt();
		product2quandity = sc.nextInt();
		product3quandity = sc.nextInt();
		product4quandity = sc.nextInt();
		product5quandity = sc.nextInt();
		if(product1quandity <= 0 || product2quandity <= 0 || product3quandity <= 0
				      || product4quandity <= 0 || product5quandity <= 0)
		{
			System.out.println("Error!!!");
		}
		else 
		{
			total = (product1quandity*100)+(product2quandity*100)+
				(product3quandity*100)+(product4quandity*100)+
                          (product5quandity*100);
			System.out.println("Total Payment: "+total);
			discount = (10*total)/100;
			double discounted = total - discount;
			if(total > 1000)
			{
				System.out.println("Your total payment is more than 1000 so 10% is discounted");
				System.out.println("Discounted Amount: "+discounted);
			}
			else
			{
				System.out.println("Your total payment is: ");
			}
			//validation completed
		
		}

	}
}