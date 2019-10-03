package com.amdocs;

public class Main {

	public static void main(String[] args) {
	//	CoffeeVendingMachine vendingMachine = new CoffeeVendingMachine();
	//	vendingMachine.powerOn();
	
		//Case 1
		String packedMDN = "512-275-3000-3003";
		
		String npa = packedMDN.substring(0, 3);
		String nxx = packedMDN.substring(4, 7);
		String fromSubscriberNo = packedMDN.substring(8, 12);
		String toSubscriberNo = packedMDN.substring(13, 17);
		
		System.out.println("NPA " + npa);
		System.out.println("NXX " + nxx);
		System.out.println("From SubscriberNo " + fromSubscriberNo);
		System.out.println("To SubscriberNo " + toSubscriberNo);
		System.out.println("-------------------------------");

		//Case 2
		packedMDN = "(512)-(275)-(3000)-(3003)";
		npa = packedMDN.substring(1, 4);
		nxx = packedMDN.substring(7, 10);
		fromSubscriberNo = packedMDN.substring(13, 17);
		toSubscriberNo = packedMDN.substring(20, 24);
		
		System.out.println("NPA " + npa);
		System.out.println("NXX " + nxx);
		System.out.println("From SubscriberNo " + fromSubscriberNo);
		System.out.println("To SubscriberNo " + toSubscriberNo);
		System.out.println("-------------------------------");

		//Case 3
		packedMDN = "(512).(275).(3000).(3003)";
		npa = packedMDN.substring(1, 4);
		nxx = packedMDN.substring(7, 10);
		fromSubscriberNo = packedMDN.substring(13, 17);
		toSubscriberNo = packedMDN.substring(20, 24);
		
		System.out.println("NPA " + npa);
		System.out.println("NXX " + nxx);
		System.out.println("From SubscriberNo " + fromSubscriberNo);
		System.out.println("To SubscriberNo " + toSubscriberNo);
		System.out.println("-------------------------------");		
		//123-123-1234-1234
		String pattern1 = "\\d{3}-\\d{3}-\\d{4}-\\d{4}";
		String mdn1 = "512-275-3000-3005";
		if ( mdn1.matches(pattern1) )
			System.out.println("Format 1");
		else 
			System.out.println("No match");
		System.out.println("-------------------------------");
		//(123)-(123)-(1234)-(1234)
		String pattern2 = "\\(\\d{3}\\)-\\(\\d{3}\\)-\\(\\d{4}\\)-\\(\\d{4}\\)";
		String mdn2 = "(512)-(275)-(3000)-(3005)";
		if ( mdn2.matches(pattern2) )
			System.out.println("Format 2");
		else 
			System.out.println("No match");
		
		//(123).(123).(1234).(1234)
		String pattern3 = "\\(\\d{3}\\).\\(\\d{3}\\).\\(\\d{4}\\).\\(\\d{4}\\)";
		String mdn3 = "(512).(275).(3000).(3005)";
		if ( mdn3.matches(pattern3) )
			System.out.println("Format 3");
		else 
			System.out.println("No match");
		
	}

}
