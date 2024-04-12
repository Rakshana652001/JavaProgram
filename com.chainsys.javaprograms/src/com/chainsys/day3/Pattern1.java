package com.chainsys.day3;

import java.util.Scanner;

public class Pattern1 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int givenNumber;
		System.out.print("Enter the number: ");
		givenNumber = sc.nextInt(); 
		if(givenNumber<=0)
		{
			System.out.println("Error!!!");
		}
		else
		{
			
			for(int row=1; row <= givenNumber; row++)
			{
				for(int column=1; column <= row; column++)
				{
					System.out.print("*");
					
				}
				System.out.print("\n");
			}
		}
		//validation completed
	}

}
