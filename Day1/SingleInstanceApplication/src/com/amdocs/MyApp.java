package com.amdocs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyApp {
	private static boolean appAlreadyRunning = false;
	
	public MyApp() {
		try {
			isAppRunning();
		}
		catch ( AppAlreadyRunningException e) {
			System.out.println("Already one instance of application is running.");
			System.exit(0);
		}
	
		System.out.println("This is the first instance of this application!");
		updateAppRunningStatus(true);
	}

	private void updateAppRunningStatus(boolean appStatus) {
		appAlreadyRunning = appStatus;
		
		try {
			BufferedWriter writer = new BufferedWriter( new FileWriter("application.txt") );
			writer.write ( ""+appAlreadyRunning );
			writer.close();
		}
		catch ( Exception e ) {
			System.out.println("Error# - Unable to write to application.txt file");
			e.printStackTrace();
		}
	}

	private void isAppRunning() 
			throws AppAlreadyRunningException {
		try {		
				BufferedReader bufferedReader = new BufferedReader ( new FileReader( "application.txt") );
				String line = bufferedReader.readLine();
				appAlreadyRunning = Boolean.parseBoolean(line);
				bufferedReader.close();
				
				if ( appAlreadyRunning == true ) {
					throw new AppAlreadyRunningException();
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MyApp app = new MyApp();
		app.start();
		
	}

	public void start() {
		while ( true ) {
			System.out.println("The application is still running ...");
		}
	}
	
}
