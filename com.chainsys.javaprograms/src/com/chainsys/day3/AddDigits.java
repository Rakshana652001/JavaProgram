package com.chainsys.day3;

import java.util.Scanner;

public class AddDigits 
{
	public static int addDigit()
	{
		Scanner scan = new Scanner(System.in);
		int number, reminder;
		int addNumber = 0;
		System.out.println("Enter a number:");
		number = scan.nextInt();
		if(number<9)
		{
			System.out.println("Enter 2digit or more than 2 digit number");
			System.out.println("Example: \n1234\n83432");
		}
		while(number>0)
			{
				reminder = number%10;
				addNumber = addNumber + reminder;
				number = number/10;
			}
		return addNumber;
		
	}
	public static void main(String[] args)
	{
		int getAdd = AddDigits.addDigit();
		System.out.println("Given digits are added: "+getAdd);
				
	}
	//validation completed
}