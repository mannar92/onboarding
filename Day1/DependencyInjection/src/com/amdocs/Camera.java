package com.amdocs;

public class Camera implements ICamera {
	private boolean status;
	
	public Camera() {
		System.out.println("Camera constructor ...");
		status = false;
	}
	
	public boolean on() {
		System.out.println("Camera on method invoked ...");
		status = true;
		return status;
	}

}