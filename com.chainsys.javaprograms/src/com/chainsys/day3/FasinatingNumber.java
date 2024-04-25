package com.chainsys.day3;

import java.util.Scanner;

public class FasinatingNumber 
{
	public static int concadenate;
	public static boolean checkNumber(int number) 
	{
		int multiplyByTwo;
		int multiplyByThree;
		multiplyByTwo = number * 2;
		multiplyByThree = number * 3;
		boolean flag = true;
		if(number>100)
		{
			String numberString = Integer.toString(number);
			String multiplyByTwoString = Integer.toString(multiplyByTwo);
			String multiplyByThreeString = Integer.toString(multiplyByThree);
			String concadenate = numberString + multiplyByTwoString + multiplyByThreeString;
			System.out.println(concadenate);
			for(char c = '1'; c <= '9'; c++) 
			{
				int count = 0;
				for(int initial = 0; initial < concadenate.length(); initial++)
				{
					char ch = concadenate.charAt(initial); 
					if(ch == c) 
					count++;
				}
				 if(count > 1 || count == 0) 
				 {  
			            flag = false;  
			            break;  
			     }
			}
			
		}
		else
		{
			flag = false;
		}
		
		return flag;
			
	}
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: ");
		number = scan.nextInt();
		boolean res = checkNumber(number);
		if(res)
		{
			
			System.out.println("Fasinating number");
		}
		else
		{
			System.out.println("Not a fasinating number");
		}
			
	}


}
