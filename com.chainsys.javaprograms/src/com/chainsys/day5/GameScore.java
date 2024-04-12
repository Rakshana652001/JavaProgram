package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class GameScore 
{
	public static String displayHighScorePosition()
	{
		Scanner scan = new Scanner(System.in);
		String playerName;
		int positionOfPlayer;
		System.out.println("Enter your name: ");
		playerName = scan.next();
		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		Matcher m = p.matcher(playerName);  
	    if(m.find())
	    {
	    	positionOfPlayer = GameScore.calculateHighScorePosition();
			System.out.println(playerName+", manage to get into position.");
			System.out.println("Your position is "+positionOfPlayer+
					                        ", on the high score table.");
	    }
	    else
	    {
	    	System.out.println("Error!!!");
	    	GameScore.displayHighScorePosition();
	    }
		return playerName;
		//score 1500 900 400 50
		
	}
	public static int calculateHighScorePosition()
	{
		Scanner scan = new Scanner(System.in);
		int playerScore;
		int playerPosition = 0;
		System.out.println("Enter your score: ");
		playerScore = scan.nextInt();
		if(playerScore <= 0)
		{
			System.out.println("Error!!!");
			return 0;
		}
		else
		{
			if(playerScore >= 1000)
			{
				playerPosition = 1;
				return playerPosition;
			}
			else if(playerScore < 1000 && playerScore >= 500)
			{
				playerPosition = 2;
				return playerPosition;
			}
			else if(playerScore < 500 && playerScore >= 100)
			{
				playerPosition = 3;
				return playerPosition;
			}
			else
			{
				playerPosition = 4;
				return playerPosition;
			}
			
		}
		
	}
	public static void main (String[] args) 
	{
		
		String playerName = GameScore.displayHighScorePosition();
				
	}

}
