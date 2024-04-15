package com.chainsys.day7;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting 
{
	public static void ascendingSort(int[] array)
	{
		System.out.println("\nAscending sort:");
		for(int initial = 0 ; initial<array.length ; initial++)
		{
			Arrays.sort(array);
			System.out.print(array[initial]+" ");
		}
		
	}
	
	
	public static void sortFromIndexToIndex(int[] array)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nFrom Index & To Index:");
		int fromIndex;
		System.out.println("From index: ");
		fromIndex = scan.nextInt();
		int endIndex;
		System.out.println("End index: ");
		endIndex = scan.nextInt();
		System.out.println("Sorted from "+fromIndex+" to "+endIndex+":");
		for(int initial = fromIndex ; initial<endIndex ; initial++)
		{
			Arrays.sort(array);
			System.out.print(array[initial]+" ");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		//get the size and get number or alphabets in array
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arraySize = scan.nextInt();
		int array[] = new int[arraySize];
		System.out.println("Enter the numbers to sort: ");
		for(int initial = 0 ; initial < array.length; initial++)
		{
			array[initial] = scan.nextInt();
		}
		
		Sorting.ascendingSort(array);
		Sorting.sortFromIndexToIndex(array);
	
	}	
}

//same for int,double,float,short,char
	//ascending sort
	//fromIndex to endIndex
	//parallel sort (split the length into two sort then merge)

