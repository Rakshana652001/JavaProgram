package com.chainsys.day3;

import java.util.Scanner;

public class BonusSalary {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double salary;
		int yearofservice;
		double fivepercentage;
		double bonus;
		double netbonusamount;
		System.out.println("Enter the year of sevice: ");
		yearofservice = sc.nextInt();
		if(yearofservice <= 0)
		{
			System.out.println("Error!!!");
		}
		else 
		{
			System.out.println("Enter your salary: ");
			salary = sc.nextDouble();
			if(salary <= 0)
			{
				System.out.println("Error!!!");
			}
			else 
			{
				System.out.println("Year of Service: "+yearofservice);
				System.out.println("Salary Amount: "+salary);
				fivepercentage = (5*salary)/100;
				bonus = salary + fivepercentage;
				if(yearofservice > 5)
				{
					System.out.println("Service year is more than 5 so 5% bonus: "
		                                                +bonus);
				}
				else
				{
					System.out.println("Service year is less than 5 so no bonus");
				}
				//validation completed
			}

		}
	}
}