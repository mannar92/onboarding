package com.amdocs.designpatterns;

import java.util.HashMap;

public class AlgorithmFactory {

	private static HashMap<Integer, String> classNameMap;
	
	static {
		classNameMap = new HashMap<Integer,String>();
		
		classNameMap.put (1, "com.amdocs.designpatterns.InsertionSort");
		classNameMap.put (2, "com.amdocs.designpatterns.BubbleSort");
		classNameMap.put (3, "com.amdocs.designpatterns.QuickSort");
	}

	public static String getClassName( int choice ) {
		return classNameMap.get(choice);
	}
	
	public static IAlgorithm getAlgorithm( int choice ) {

		String className = getClassName(choice);
		
		IAlgorithm algorithm = null;
		try {
			algorithm = (IAlgorithm) Class.forName(className).newInstance();
		}
		catch ( Exception e) {
			algorithm = new NullAlgorithm();
		}

		return algorithm;

	}
	
}
