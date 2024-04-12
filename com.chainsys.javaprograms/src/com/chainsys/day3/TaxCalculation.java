package com.chainsys.day3;

import java.util.Scanner;

public class TaxCalculation {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double salary, deductedSalary,tenPercent, twentyPercent, 
		                    thirtyPercent;
		System.out.println("Enter the salary: ");
		salary = sc.nextDouble();
		if(salary <= 0 || salary <= 100000)
		{
			System.out.println("Error!!!");
			System.out.println("Salary want to be more than 100000");
		}
		else
		{
			System.out.println("Total Salary: "+salary);
			deductedSalary = salary-100000;
			System.out.println("Deducted Salary: "+deductedSalary);
			if(salary <= 100000 && deductedSalary <= 100000)
			{
				System.out.println("Tax is 0");
			}
			else if(salary > 100000 && salary <= 200000)
			{
				tenPercent = (10*deductedSalary)/100;
				System.out.println("10% tax is deducted: " + tenPercent);
			}
			else if(salary > 200000 && salary <= 500000)
			{
				twentyPercent = (20*deductedSalary)/100;
				System.out.println("20% tax is deducted: " + twentyPercent);
			}
			else if(salary > 500000)
			{
				thirtyPercent = (30*deductedSalary)/100;
				System.out.println("30% tax is deducted: " + thirtyPercent);
			}
		}
		
	}

}
