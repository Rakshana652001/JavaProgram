package com.chainsys.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass 
{
	
	String regex = "^[0-9]*$";
	public static String bookNameReturn()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Book Details");
		System.out.println("Book Name:");
		
		String bookName = scan.next();
		Pattern p = Pattern.compile("^[a-zA-z0-9]*$");
		Matcher m = p.matcher(bookName);
		if(m.find())
		{
			return bookName;
		}
		else
		{
			System.out.println("Book name can only contain:"
					+ "\nAlphabets in lower and upper case\nand numbers");
			TestClass.bookNameReturn();
			
		}
		return bookName;
	}
	
	public static String authorNameReturn()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Book Details");
		System.out.println("Author's Name:");
		String authorName = scan.next();
		Pattern p = Pattern.compile("^[a-zA-z]*$");
		Matcher m = p.matcher(authorName);
		if(m.find())
		{
			return authorName;
		}
		else
		{
			System.out.println("Book name can only contain:\nAlphabets in lower and upper case\nand numbers");
			TestClass.authorNameReturn();
			
		}
		return authorName;
	}
	public static void main (String[] args) 
	{
		
		BookDetails getbookDetails = new BookDetails();
		getbookDetails.setNameOfTheBook(TestClass.bookNameReturn());
		getbookDetails.setGenreOfTheBook("TimeTravel");
		getbookDetails.setParts(1);
		getbookDetails.setPublishedYear(2020);
		getbookDetails.setAuthorName(TestClass.authorNameReturn());
		Scanner scan = new Scanner(System.in);
		System.out.println("enter book rating:");
		float rating = scan.nextFloat();
		if(rating > 0 )
		{
			getbookDetails.setBookRating(rating);
			
		}
		else
		{
			System.out.println("Enter rating between (0-10)");
			System.out.println("enter book rating:");
			rating = scan.nextInt();
		}
		getbookDetails.setParts(1);
		System.out.println("Book Name: "+getbookDetails.getNameOfTheBook());
		System.out.println("Genre: "+getbookDetails.getGenreOfTheBook());
		System.out.println("Author Name: "+getbookDetails.getAuthorName());
		System.out.println("Parts: "+getbookDetails.getParts());
		System.out.println("Published year: "+getbookDetails.getPublishedYear());
		System.out.println("Rating: "+getbookDetails.getBookRating());
	}

}
