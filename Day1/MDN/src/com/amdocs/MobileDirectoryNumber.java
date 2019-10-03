package com.amdocs;

import java.text.MessageFormat;

public class MobileDirectoryNumber {
	private String strNPA;
	private String strNXX;
	private String strSubscriberNo;
	private String format;
	
	private String mdn;
	
	public MobileDirectoryNumber(String npa, String nxx, String subscriberNo, String format) {
		strNPA = npa;
		strNXX = nxx;
		strSubscriberNo = subscriberNo;
		this.format = format;
		System.out.println(format);
	}
	
	public void print() {
		
		String[] params = new String[3];
		params[0] = strNPA;
		params[1] = strNXX;
		params[2] = strSubscriberNo;
		
		mdn = strNPA + strNXX + strSubscriberNo;
		mdn = mdn.replace(format, "$1$2$3");
		
		
		//mdn = format.replaceAll("/d{3}", params[0] );
		//mdn = new MessageFormat(format).format( params );
		
		System.out.println(mdn);
	}

}