package com.amdocs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		displayMenu();
		String choice = getChoice();
		ICar car = createCar(choice);
		car.drive();
		
	}
	
	private static ICar createCar(String choice) {
		
		String className = "com.amdocs." + choice;
		ICar car = null;
		
		try {
			car = (ICar) Class.forName(className).newInstance();
		} catch (Exception e) {
			car = new NullCar();
		}

		return car;		
	}

	private static String getChoice() {
		Scanner scanner = new Scanner ( System.in );
		String choice = scanner.nextLine();
		return choice;
	}

	private static void displayMenu() {
		System.out.println("----------------");
		System.out.println("Menu");
		System.out.println("----------------");
		System.out.println("Choose your car");
	}








}
