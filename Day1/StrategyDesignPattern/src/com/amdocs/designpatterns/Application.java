package com.amdocs.designpatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	public static void sort( ArrayList<Integer> numbers, int choice ) {
		
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);	
		algorithm.sort(numbers);
		
	}
	
	public static void displayMenu() {
		System.out.println("########################");
		System.out.println("         Menu");
		System.out.println("########################");
		System.out.println("Insertion Sort ------> 1");
		System.out.println("Bubble Sort ---------> 2");
		System.out.println("Quick Sort ----------> 3");
		System.out.println("Exit ----------------> 4");
		System.out.println("########################");
		System.out.println();
	}
	
	public static int getChoice() {
		Scanner scanner = new Scanner ( System.in );
		System.out.print("Choose your algorithm : ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(1);
		numbers.add(5);
		int choice = 0;
		
		while ( choice != 4 ) {
			displayMenu();
			choice = getChoice();
			if ( choice == 4) break;
			sort ( numbers, choice );
		}
		System.out.println("Thank you for using this software!");
		
	}

}
