package com.chainsys.day2;

import java.util.Scanner;

public class Student 
{
	public static void main (String[] args) 
	{
		String nameofstudent;
		String addressofstudent;
		int ageofstudent;
		String schoolname;
		long phonenumber;
		int marks;
		char boodgroup;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the student: ");
		nameofstudent = sc.next();
		System.out.println("Address: ");
		addressofstudent = sc.next();
		System.out.println("School name: ");
		schoolname = sc.next();
		System.out.println("Phone Number: ");
		phonenumber = sc.nextLong();
		System.out.println("Marks Obtained: ");
		marks = sc.nextInt();
		System.out.println("Student Name: "+nameofstudent);
		System.out.println("Student Address: "+addressofstudent);
		System.out.println("School Name: "+schoolname);
		System.out.println("Phone Number of the student: "+phonenumber);
		System.out.println("Marks Obtaied: "+marks);
		
	}
	

}
