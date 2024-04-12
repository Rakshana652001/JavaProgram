package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LetterToAscii 
{
	public static int letterToAscii()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter the Name: ");
		name = sc.next();
		System.out.println("Name: "+name);
		int length = name.length();
		System.out.println("The length of the name is "
				+ ""+length+
		    		 " so pick a number within "+length+":");
		int number = sc.nextInt();
		if(number>=length)
		{
			System.out.println("Error!!! Enter a letter with in "+length);
		}
		else
		{
			System.out.println("Ascii number: "+name.codePointAt(number));
		}
		return number;
	}
	public static void main (String[] args)
	{
		int getAsciiValue = LetterToAscii.letterToAscii();
		//not completed fully
	}

}
