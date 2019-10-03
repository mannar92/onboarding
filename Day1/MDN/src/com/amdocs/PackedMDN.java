package com.amdocs;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PackedMDN {
	protected String strNPA;
	protected String strNXX;
	protected String strFromSubscriberNo;
	protected String strToSubscriberNo;
	protected String packedMDN;
	protected String packedMDNFormat;
	
	private PackedMDNFormatDetector packedMDNFormatDetector;
	
	protected ArrayList<MobileDirectoryNumber> listOfMDNs;

	public PackedMDN(String packedMDN) {
		
		listOfMDNs = new ArrayList<MobileDirectoryNumber>();
		
		this.packedMDN = packedMDN;
		packedMDNFormatDetector = new PackedMDNFormatDetector(packedMDN);
		packedMDNFormat = packedMDNFormatDetector.getPackedMDNFormat();
		System.out.println(packedMDNFormat);
		extractMDNs();
	}
	
	private void extractMDNs() {
		String[] tokens = new String[4];		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher( packedMDN );
		
		int index = 0;
		while ( matcher.find() ) {
			tokens[index++] = matcher.group();
		}
		
		strNPA = tokens[0];
		strNXX = tokens[1];
		strFromSubscriberNo = tokens[2];
		strToSubscriberNo = tokens[3];
		
		int fromSubscriberNo = Integer.parseInt(strFromSubscriberNo);
		int toSubscriberNo = Integer.parseInt(strToSubscriberNo);
		
		String mdnFormat = packedMDNFormatDetector.getMDNFormat(packedMDNFormat);
		
		for ( int subscriberNo = fromSubscriberNo; subscriberNo <= toSubscriberNo; ++subscriberNo ) {
			packedMDN = strNPA + strNXX + subscriberNo;
			packedMDN.replaceAll( packedMDNFormat, "$1$2$3$4");
			listOfMDNs.add(new MobileDirectoryNumber(strNPA, strNXX,""+subscriberNo, mdnFormat ) );
		}
	}
		
	public void printAllMDNs() {
		for ( MobileDirectoryNumber mdn : listOfMDNs )
			mdn.print();
	}

	public ArrayList<MobileDirectoryNumber> getAllMDNs() {
		return listOfMDNs;
	}
}