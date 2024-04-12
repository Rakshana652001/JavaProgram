package com.chainsys.day3;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		if(number <= 0)
		{
			System.out.println("Error!!!");
		}
		else
		{
			int endNumber;
			System.out.println("Enter an endNumber for loop: ");
			endNumber = sc.nextInt();
			if(endNumber <= 0)
			{
				System.out.println("Error!!!");
			}
			else
			{
				System.out.println("Multiplication table: ");
				for(int initial = 1;initial <= endNumber; initial++)
				{
					
					System.out.println(number+" * "+initial+" = "+number*initial);
				}
			}
			
		}
		//validation completed
	}

}
