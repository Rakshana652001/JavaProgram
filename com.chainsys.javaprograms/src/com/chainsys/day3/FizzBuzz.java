package com.chainsys.day3;

import java.util.Scanner;

public class FizzBuzz 
{
	public static void main (String[] args)
	{
		for(int initial=1; initial<=100;initial++)
		{
			if(initial%3==0)
			{
				System.out.println(initial+": Fizz");
			}
			if(initial%3==0 && initial%5==0)
			{
				System.out.println(initial+": FizzBuzz");
			}
			else if(initial%5==0)
			{
				System.out.println(initial+": Buzz");
			}
			
			
		}
	}

}
