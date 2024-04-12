package com.chainsys.day3;

import java.util.Scanner;

public class IfElseColon {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		System.out.println("Enter number1: ");
		number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		number2 = sc.nextInt();
		if(number1 <= 0 || number2 <= 0)
		{
			System.out.println("Error!!!");
		}
		else
		{
			if(number1>number2);
			{
				System.out.println("number1 greater than number2");
			}
			
		}	
	}

}
