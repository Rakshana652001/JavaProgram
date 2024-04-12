package com.chainsys.day3;

import java.util.Scanner;

public class SolveEquation 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int equation;
		for(int y = 5; y<=10; y++)
		{
			equation = 2*(y*y)+y+5;
			System.out.println("2*"+"("+y+"*"+y+")"+"+"+y+"+"+"5: "+equation);
		}
	}

}
