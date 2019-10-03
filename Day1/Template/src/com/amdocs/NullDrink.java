package com.amdocs;

public class NullDrink extends Drink {

	@Override
	protected void getWater() {
		
	}

	@Override
	protected void boilWater() {
	}

	@Override
	protected void getIngredients() {
	}

	@Override
	protected void mix() {
	}

	@Override
	protected void serve() {
		System.out.println("Sorry, you chose an unsupported drink");
		System.out.println("Choose a valid drink ...");
	}

}
