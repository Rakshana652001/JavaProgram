package com.chainsys.day3;

import java.util.Scanner;

public class FindExpressions {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = 2;
		int y = 5;
		int z = 0;
		if(x==2)
		{
			System.out.println("x==2 : ");
		}
		else if(x!=5)
		{
			System.out.println("x!=5 : ");
		}
		else if(x!=5 && y>=5)
		{
			System.out.println("x!=5 && y>=5 : ");
		}
		else if(z != 0 || x == 2)
		{
			System.out.println("z != 0 || x == 2 : ");
		}
		else if(!(y < 10))
		{
			System.out.println("!(y < 10) : ");
		}
	}

}
