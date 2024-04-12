package com.chainsys.day3;

import java.util.Scanner;

public class OddEvenCube 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		for(int initial=1;initial<=number;initial++)
		{
			if(initial%2==0)
			{
				System.out.println("Even: "+initial);
			}
			else if(initial%2 != 0)
			{
				System.out.println("Odd: "+initial);
			}
			System.out.println("Cube: "+(initial*initial*initial));
			
		}
		//not completed
	}

}
