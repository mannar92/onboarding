package com.amdocs;

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		if ( instance1 == instance2 ) {
			System.out.println("Both references seems to be pointing to one object");
		}
		else
			System.out.println("Looks like, we managed to create multiple instances");
	}

}
