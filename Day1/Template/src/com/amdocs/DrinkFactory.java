package com.amdocs;

import java.util.HashMap;

public class DrinkFactory {

	private static HashMap<Integer, String> drinkNameMap;
	
	static {
		drinkNameMap = new HashMap<Integer,String>();
		
		drinkNameMap.put ( 1, "com.amdocs.Expresso" );
		drinkNameMap.put ( 2, "com.amdocs.Latte" );
	}
	
	public static Drink getDrink( int choice ) {
		Drink drink = null;
		String className;
		
		try {
			className = drinkNameMap.get( choice );
			drink = (Drink) Class.forName( className ).newInstance();
		}
		catch (Exception e) {
			drink = new NullDrink();
		}
		
		return drink;
	}
	
}
