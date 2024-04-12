package com.chainsys.day2;

import java.util.Scanner;

public class StudentMarkAverage {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String studentname;
		int tamil;
		int english;
		int maths;
		int science;
		int social;		
		int total;
		System.out.println("Student Name: ");
		studentname = sc.next();
		System.out.println("Name of the student:"+studentname);
		System.out.println("Tamil mark: ");
		tamil = sc.nextInt();
		System.out.println("English mark: ");
		english = sc.nextInt();
		System.out.println("Maths mark: ");
		maths = sc.nextInt();
		System.out.println("Science mark: ");
		science = sc.nextInt();
		System.out.println("Social mark: ");
		social = sc.nextInt();		
		int totalmarks = 500;
		double percentage;
		total = tamil+english+maths+science+social;
		System.out.println("Total Marks: "+total);
		if(tamil <36 || english <36 || maths <36 || science <36 || social <36)
		{
			System.out.println("Failed");
		}
		else 
		{
			percentage = (total*100)/totalmarks;
			System.out.println("Percentage: "+percentage+"%");
			if(total == totalmarks)
		    {
				System.out.println("Distinction");
		    }
			else if(percentage >= 75.0 && percentage <= 100)
			{
				System.out.println("First class");
			}
			else if(percentage < 75.0 && percentage >= 50)
			{
				System.out.println("Second class");
			}
			else
			{
				System.out.println("Third class");
			}
		}
		
	}
	

}
