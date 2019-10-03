package com.amdocs;

class DummyCamera implements ICamera {
	
	public boolean on() {
		System.out.println("Dummy Camera on method invoked ...");
		return true;
	}

}

public class Main {

	public static void main(String[] args) {

		Mobile mobile = new Mobile(new DummyCamera() );
		
		boolean actualStatus = mobile.startPhotoApp();
		boolean expectedStatus = true;
		
		if ( actualStatus == expectedStatus ) 
			System.out.println("StartPhotoApp functionality works as expected!");
		else
			System.out.println("StartPhotoApp functionality isn't working.");

	}

}
