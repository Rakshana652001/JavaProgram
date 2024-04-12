package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperators 
{
	public static void main (String[] args)
	{
		int variable1, variable2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter variable 1:");
		variable1 = sc.nextInt();
		System.out.println("Enter variable 2: ");
		variable2 = sc.nextInt();
		System.out.println("Variable 1: "+variable1);
		System.out.println("Variable 2: "+variable2);
		if(variable1 <= 0 || variable2 <= 0)
		{
			System.out.println("Error!!!");
		}
		else
		{
			if(variable1 >= variable2)
			{
				System.out.println("Variable1 is greater than variable2");
			}
			else
			{
				System.out.println("Variable1 is less than variable2");
			}
		}
		
		
	}
	

}
