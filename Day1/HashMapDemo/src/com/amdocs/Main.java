package com.amdocs;

import java.util.HashMap;

public class Main {

	public static void main ( String[] args ) {
	
		HashMap<String,String> contacts
			= new HashMap<String,String>();
		
		//Inserting key,value pair into HashMap
		contacts.put( "512-275-2000", "Jegan" );
		contacts.put( "512-385-1234", "Michael" );
		contacts.put( "512-421-1443", "Kevin" );
		
		String key = "512-385-1234";
		//To retrieve a value based on key
		if ( contacts.containsKey(key) ) {
			String name = contacts.get(key); 
			System.out.println(name + " calling ...");
		}
		else //In case the contact is unknown
			System.out.println( key + " calling ...");	
	
	}
	
}
