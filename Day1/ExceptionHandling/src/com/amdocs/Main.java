package com.amdocs;


public class Main {
	
	public static void F1()
	{
		int x = 100;
		int y = 0;
		int result = 0;
		System.out.println("Inside F1() method");
		try {
			x  = 100;
			y = 0;
			result = x/y;
			System.out.println("This will never get printed due to exception");
		}
		catch ( Exception e ) {
			//No business logic like this must be written inside catch blocks
			//This leads to stack correction, eventually results are unpredictable
			result = x / y;
		}
	}
	
	public static void main(String[] args) 
	{
		F1();
	}

}
