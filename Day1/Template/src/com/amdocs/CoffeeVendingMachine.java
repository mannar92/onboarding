package com.amdocs;

import java.util.Scanner;

public class CoffeeVendingMachine {

	private int choice;
	private Scanner scanner;
	
	public CoffeeVendingMachine() {
		System.out.println("Hi there!");
		
		choice = 0;
		scanner = new Scanner( System.in ); 
	}
	
	private void displayMenu() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("     Choose your drink     ");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Expresso ---------------> 1");
		System.out.println("Latte ------------------> 2");
		System.out.println("No thank you -----------> 3");
	}
	
	private void getChoice() {
		System.out.println("\nPick your drink : ");
		choice = scanner.nextInt();
		if ( choice == 3 ) {
			System.out.println("Bye, switching off the vending machine ...");
			System.exit(0);
		}
		System.out.println();
	}

	private void serveDrink() {
		Drink drink = DrinkFactory.getDrink(choice);
		drink.makeDrink();
	}
	
	public void powerOn() {	
		while ( true ) {
			displayMenu();
			getChoice();
			serveDrink();
		}
	}
}
