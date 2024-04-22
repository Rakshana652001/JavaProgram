package com.chainsys.oops;

import java.util.Scanner;

public class HospitalImplementation implements HospitalInterface
{
	Scanner scan = new Scanner(System.in);
	public void hospitalName()
	{
		System.out.println("Name of the hospital: ");
		Object nameofhospital = scan.nextLine();
		System.out.println("Hospital Name: "+nameofhospital);
		
	}
	
	public void hospitalLocation()
	{
		System.out.println("Location of the hospital: ");
		Object locationofhospital = scan.nextLine();
		System.out.println("Hospital location: "+locationofhospital);
	}


}

