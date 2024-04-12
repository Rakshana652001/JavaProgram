package com.chainsys.day3;

import java.util.Scanner;

public class PrintEven 
{
	public static int number;
	public static int getNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		System.out.println("````````````````");
		int reverseNumber = 0;
		number = scan.nextInt();
		while(number != 0)
		{
			int remainder = number % 10;  
			reverseNumber = reverseNumber * 10 + remainder;  
			number = number/10;
		}
		 
		if(reverseNumber<=0 || reverseNumber <= 10)
		{
			System.out.println("Enter more than 2 digit numbers!!!");
			System.out.println("Like:"+"\n"+"123\n456");
			PrintEven.getNumber();
		}
		return reverseNumber;
	}
	
	public static int getRemainder(int reverseNumber)
	{
		
		int remainder;
		System.out.println("Even numbers: ");
		while(reverseNumber>0)
		{
			remainder = reverseNumber%10;
			reverseNumber = reverseNumber/10;
			
			if(remainder % 2 == 0)
			{
				System.out.println(remainder);
			}	
		}
		return reverseNumber;
		
	}
	
	public static void main (String[] args)
	{
		PrintEven.getNumber();
		PrintEven.getRemainder(number);
	}

}
