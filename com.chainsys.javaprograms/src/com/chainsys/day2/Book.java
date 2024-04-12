package com.chainsys.day2;

import java.util.Scanner;

public class Book {
	public static void main(String[] args)
	{
		String genre;
		String nameofbook;
		String charectername;
		int publishyear;
		int partscount;
		String authorname;
		int ratingcount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name the genre of the book: ");
		genre = sc.next();
		System.out.println("Book Name: ");
		nameofbook = sc.next();
		System.out.println("Charecters Name: ");
		charectername = sc.next();
		System.out.println("Year Published: ");
		publishyear = sc.nextInt();
		System.out.println("Number of parts in "+nameofbook);
		partscount = sc.nextInt();
		System.out.println("Author of "+nameofbook+" is: ");
		authorname = sc.next();
		System.out.println("Rating for "+nameofbook+" is: ");
		ratingcount =sc.nextInt();
		System.out.println("Genre of the book: "+genre);
		System.out.println("Name of the book: "+nameofbook);
		System.out.println("Name of the charecters: "+nameofbook+" is: "+charectername);
		System.out.println("Published year of "+nameofbook+" is: "+publishyear);
		System.out.println("Number of parts in "+nameofbook+" is: "+partscount);
		System.out.println("Author of "+nameofbook+" is: "+authorname);
		System.out.println("Rating for "+nameofbook+" is: "+ratingcount+"star");
	}

}
