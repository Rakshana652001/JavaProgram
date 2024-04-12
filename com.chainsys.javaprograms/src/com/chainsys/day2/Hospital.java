package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {
	public static void main (String[] args)
	{
		String nameofhospital;
		String locationofhospital;
		int doctorscount;
		int patientscount;
		int nursecount;
		double totalincome;
		double totalpayments;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the hospital: ");
		nameofhospital = sc.nextLine();
		System.out.println(nameofhospital+"'s Location: ");
		locationofhospital = sc.next();
		System.out.println("Doctors count: ");
		doctorscount = sc.nextInt();
		System.out.println("Patiens count: ");
		patientscount = sc.nextInt();
		System.out.println("Nurses count: ");
		nursecount = sc.nextInt();
		System.out.println("Total Income: ");
		totalincome = sc.nextDouble();
		System.out.println("Total Payments: ");
		totalpayments = sc.nextDouble();
		System.out.println("Hospital Name: "+nameofhospital);
		System.out.println("Hospital Location: "+locationofhospital);
		System.out.println("Doctors count in "+nameofhospital+" is: "+doctorscount);
		System.out.println("Nurses count in "+nameofhospital+" is: "+nursecount);
		System.out.println("Patients count in "+nameofhospital+" is: "+patientscount);
		System.out.println("Total incomes in a month: "+totalincome);
		System.out.println("Total payments in a month: "+totalpayments);
	}

}
