package com.chainsys.day3;

import java.util.Scanner;

public class EmployeeWorkingArea {
	public static void main (String[] args)
	{
		int age;
		char sex, maritalStatus;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age < 18)
		{
			System.out.println("Error!!!");
		}
		else
		{
			System.out.println("Enter your sex (M/F): ");
			sex = sc.next().charAt(0);
			if(sex != 'M' && sex != 'F')
			{
				System.out.println("Error!!!");
			}
			else
			{
				System.out.println("Enter your Marital status (Y/N): ");
				maritalStatus = sc.next().charAt(0);
				System.out.println("Age:  "+age);
				System.out.println("Sex: "+sex);
				System.out.println("Marital Status: "+maritalStatus);
				if(sex == 'F')
				{
					System.out.println("Female employee should work in urban areas");
				}
				else if(sex == 'M' && (age >= 20 && age <40))
				{
					System.out.println("Male employee can work any areas");
				}
				else if(sex == 'M' && (age >=40 && age <= 60))
				{
					System.out.println("Male employee should work in urban areas");
				}
				else
				{
					System.out.println("ERROR!!");
				}
			}
			
		}
		
	}

}
