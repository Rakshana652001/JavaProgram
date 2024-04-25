package com.chainsys.day4;

import java.util.Scanner;

public class Addition 
{
	public static int addition()
	{
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		int sum = number1+number2;
		return sum;
		
	}
	public static int subtraction()
	{
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		int sub = number1-number2;
		return sub;
	}
	public void multiplication()
	{
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2: ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println("Multiplication: "+number1*number2);
	}
	public static void main(String[] args)
	{
		int sum = Addition.addition();
		System.out.println(sum);
		int sub = Addition.subtraction();
		System.out.println(sub);
		Addition rv = new Addition();
		rv.multiplication();
	}

}
