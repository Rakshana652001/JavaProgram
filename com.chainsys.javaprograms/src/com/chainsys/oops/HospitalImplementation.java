package com.chainsys.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HospitalImplementation implements HospitalInterface
{
	Scanner scan = new Scanner(System.in);
	HospitalImplementation objectForimplementation = new HospitalImplementation();
	Hospital hospitalDetails = new Hospital();
	public void hospitalName()
	{
		System.out.println("Name of the hospital: ");
		String name = scan.next();
		Pattern p = Pattern.compile("^[a-zA-z]*$");
		Matcher m = p.matcher(name);
		if(m.find())
		{
			objectForimplementation.hospitalName();
			hospitalDetails.setNameofhospital(name);
			System.out.println("Hospital Name: "+hospitalDetails.getNameofhospital());
		}
		else
		{
			System.out.println("Name should contain only alphabets!!!");
		}
		
	}
	@Override
	public void hospitalLocation() {
		System.out.println("Location of the hospital: ");
		String location = scan.next();
		hospitalDetails.setLocationofhospital(location);
		System.out.println("Hospital location: "+hospitalDetails.getLocationofhospital());
		
	}
	@Override
	public void doctorsCount() {
		System.out.println("Doctors count: ");
		int docCount = scan.nextInt();
		hospitalDetails.setDoctorscount(docCount);
		System.out.println("Doctors Count: "+hospitalDetails.getDoctorscount());
		
	}
	@Override
	public void patientscount() {
		System.out.println("Patiens count: ");
		int patientscount = scan.nextInt();
		hospitalDetails.setPatientscount(patientscount);
		System.out.println("Doctors Count: "+hospitalDetails.getPatientscount());
		
	}
	
	
	

}


