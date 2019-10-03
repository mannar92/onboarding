package com.amdocs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner( System.in );

		System.out.println("How many numbers you would like to enter ? ");
		int size = scanner.nextInt();
		int value = 0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int count=0; count< size; ++count ) {
			System.out.println("Enter any integer : ");
			value = scanner.nextInt();
			numbers.add( value );
		}
		System.out.println("Size of list is " + numbers.size() );
		System.out.println("The list elements before sorting...");
		for ( int element : numbers ) {
			System.out.println( element );
		}
		System.out.println();	
		
		numbers.sort(null);
		
		System.out.println("The list elements after sorting...");
		for ( int element : numbers ) {
			System.out.println( element );
		}
		System.out.println();	
				
		System.out.println(numbers.contains(5));
		System.out.println(numbers.indexOf(5));
	}

}
