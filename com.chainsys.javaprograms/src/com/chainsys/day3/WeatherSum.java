package com.chainsys.day3;

import java.util.Scanner;

public class WeatherSum 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char raining;
		System.out.println("It's Raining or not: ");
		raining = sc.next().charAt(0);
		if(raining != 'Y' && raining != 'y' && raining != 'N'&& raining != 'n'
				 )
		{
			System.out.println("Error!!!");
		}
		else
		{
			int temperature;
			System.out.println("Enter the temperature: ");
			temperature = sc.nextInt();
			if(temperature > 50 && temperature <=0)
			{
				System.out.println("Error!!!");
				
			}
			else
			{
				if(raining == 'Y' || raining == 'y')
				{
					System.out.println("It's Raining bring umberlla.");
				}
				else if(raining == 'N'|| raining == 'n')
				{
					System.out.println("No Rain!! No need to bring umberlla.");
				}
				
				if(temperature <= 32)
				{
					System.out.println("It's too cold!!! Bring Jacket.");
				}
				else if(temperature > 32 && temperature <= 50)
				{
					System.out.println("It's not too cold!!! Bring light Jacket.");
				}
				else
				{
					System.out.println("Temperature is normal!!! No need to bring jacket.");
				}
			}
			//validation completed
		}
		
		
				
	}

}
