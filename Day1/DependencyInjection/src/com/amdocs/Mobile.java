package com.amdocs;

public class Mobile {
	private ICamera camera;
	
	//Dependency Injection or Dependency Inversion
	//Inversion of Control (IOC)
	public Mobile(ICamera camera) {
		System.out.println("Mobile overloaded constructor");
		this.camera = camera;
	}
	
	public boolean startPhotoApp() {
		
		if ( camera.on() ) {
			System.out.println("Positive code path ...");
			return true;
		}
		else 
			System.out.println("Negative code path");
		
		return false;
	
	}
	
}
