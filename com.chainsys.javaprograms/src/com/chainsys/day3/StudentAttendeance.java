package com.chainsys.day3;

import java.util.Scanner;

public class StudentAttendeance {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int classHeld, classAttended, attendancePercentage;
		System.out.println("Enter total class held: ");
		classHeld = sc.nextInt();
		if(classHeld <=0 )
		{
			System.out.println("Error!!!");
		}
		else
		{
			System.out.println("Enter attended days: ");
			classAttended = sc.nextInt();
			if(classAttended <= 0)
			{
				System.out.println("Error!!!");
			}
			else
			{
				attendancePercentage = (classAttended*100)/classHeld;
				char medicalCause;
				System.out.println("Enter 'Y' or 'N' if any medical cause: ");
				medicalCause = sc.next().charAt(0);
				if(medicalCause == 'Y' || medicalCause == 'N')
				{
					System.out.println("Total class attended: "+classAttended);
					System.out.println("Medical Cause: "+medicalCause);
					if(attendancePercentage >= 75)
					{
						System.out.println("Permitted to attend the exam");
					}
					else if(medicalCause == 'Y')
					{
						System.out.println("Permitted to attend the exam");
					}
					else
					{
						System.out.println("Not permitted to attend the exam");
					}
				}
				else
				{
					System.out.println("Error!!!");
				}
				//validation completed
			}
			
		}
		
	}

}
