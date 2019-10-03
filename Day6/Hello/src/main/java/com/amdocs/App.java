package com.amdocs;

public class App {

	public String sayHello() {
		return "Hello Maven!";
	}

	public static void main ( String[] args ) {
		App app = new App();
		System.out.println ( app.sayHello() );
	}

}
