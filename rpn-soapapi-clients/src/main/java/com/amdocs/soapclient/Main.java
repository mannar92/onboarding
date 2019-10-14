package com.amdocs.soapclient;

import com.amdocs.*;
import com.amdocs.RPNCalculator;

public class Main {

	public static void main(String[] args) {
		
		RPNCalculatorService rpnCalculatorService = new RPNCalculatorService();
		
		RPNCalculator rpnCalculatorWS = rpnCalculatorService.getRPNCalculator();
		
		double result = rpnCalculatorWS.evaluate("10 155 +");
		
		System.out.println("The result is " + result);
	}

}
