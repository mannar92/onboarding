package com.amdocs;

public class NullCar implements ICar {

	@Override
	public void drive() {
		System.out.println("Perform error handling logic here..");
		System.out.println("Perform error log, etc., here");
	}

}
