package com.amdocs;

import java.util.ArrayList;
import java.util.HashMap;

public class PackedMDNFormatDetector {

	private String packedMDN;
	private String detectedPattern;
	
	private ArrayList<String> packedMDNPatterns;
	
	private HashMap<String,String> packedMDNFormatToMDNFormatMap;

	public PackedMDNFormatDetector(String packedMDN) {
		packedMDNPatterns = new ArrayList<String>();
		packedMDNFormatToMDNFormatMap = new HashMap<String,String>();
		populatePatterns( );		
		detectedPattern = "";
		this.packedMDN = packedMDN;
	}
	
	private void populatePatterns() {
		packedMDNPatterns.add("\\d{3}-\\d{3}-\\d{4}-\\d{4}");
		packedMDNPatterns.add("\\(\\d{3}\\)-\\(\\d{3}\\)-\\(\\d{4}\\)-\\(\\d{4}\\)");
		packedMDNPatterns.add("\\(\\d{3}\\).\\(\\d{3}\\).\\(\\d{4}\\).\\(\\d{4}\\)");
		
		packedMDNFormatToMDNFormatMap.put("\\d{3}-\\d{3}-\\d{4}-\\d{4}", "\\d{3}-\\d{3}-\\d{4}" );
		packedMDNFormatToMDNFormatMap.put("\\(\\d{3}\\)-\\(\\d{3}\\)-\\(\\d{4}\\)-\\(\\d{4}\\)", "\\(\\d{3}\\)-\\(\\d{3}\\)-\\(\\d{4}\\)" );
		packedMDNFormatToMDNFormatMap.put("\\(\\d{3}\\).\\(\\d{3}\\).\\(\\d{4}\\).\\(\\d{4}\\)", "\\(\\d{3}\\).\\(\\d{3}\\).\\(\\d{4}\\)" );
	}
	
	public String getPackedMDNFormat( ) {
		for ( String pattern : packedMDNPatterns ) {
			detectedPattern = packedMDN.matches(pattern) ? pattern : "";
			if ( detectedPattern != "" )
				break;
		}
		return detectedPattern;
	}
	
	public String getMDNFormat( String packedMDNPattern ) {
		return packedMDNFormatToMDNFormatMap.get( packedMDNPattern );
	}
		
}