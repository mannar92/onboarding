package com.amdocs;

public abstract class Drink {

	protected abstract void getWater();
	protected abstract void boilWater();
	protected abstract void getIngredients();
	protected abstract void mix();
	protected abstract void serve();
	
	public final void makeDrink() {
		getWater();
		boilWater();
		getIngredients();
		mix();
		serve();
	}
	
}
