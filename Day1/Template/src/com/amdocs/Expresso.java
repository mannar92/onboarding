package com.amdocs;

public class Expresso extends Drink {

	@Override
	protected void getWater() {
		System.out.println("Took 50ml of plain drinking water ...");
	}

	@Override
	protected void boilWater() {
		System.out.println("Boiling the drinking water ...");
	}

	@Override
	protected void getIngredients() {
		System.out.println("Retrieved 15 grams of coffee powder ...");
	}

	@Override
	protected void mix() {
		System.out.println("Mixing boiled water with coffer powder ...");
	}

	@Override
	protected void serve() {
		System.out.println("Your expresso is ready!");
	}

}
