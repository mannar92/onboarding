package com.amdocs; 

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class  RPNCalculatorTest {

    @Test
    public void testAddition(){

        RPNCalculator rpnCalculator = new RPNCalculator();

        double actualResult = rpnCalculator.evaluate("10 15 +");
        double expectedResult = 25.0;
        assertEquals(expectedResult, actualResult, 0.0001);

        actualResult = rpnCalculator.evaluate("100 15 +");
        expectedResult = 115.0;
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testSubtraction(){

        RPNCalculator rpnCalculator = new  RPNCalculator();

        double actualResult = rpnCalculator.evaluate("100 15 -");
        double expectedResult = 85.0;
        assertEquals(expectedResult, actualResult, 0.0001);

        actualResult = rpnCalculator.evaluate("10 5 -");
        expectedResult = 5.0;
        assertEquals(expectedResult, actualResult, 0.0001);

    }

    @Test
    public void testMultiplication(){

        RPNCalculator rpnCalculator = new RPNCalculator();

        double actualResult = rpnCalculator.evaluate("100 15 *");
        double expectedResult = 1500.0;
        assertEquals(expectedResult, actualResult, 0.0001);

        actualResult = rpnCalculator.evaluate("10 15 *");
        expectedResult = 150;
        assertEquals(expectedResult, actualResult, 0.0001); 
    }

    @Test
    public void testDivision(){

        RPNCalculator rpnCalculator = new RPNCalculator();

        double actualResult = rpnCalculator.evaluate("100 10 /");
        double expectedResult = 10.0;
        assertEquals(expectedResult, actualResult, 0.0001);

        actualResult = rpnCalculator.evaluate("10 5 /");
        expectedResult = 2.0;
        assertEquals(expectedResult, actualResult, 0.0001); 
    }

    public void testComplexRPNMathExpresion() { 

        RPNCalculator rpnCalculator = new RPNCalculator();

        double actualResult = rpnCalculator.evaluate("10 5 + 100 20 / -");
        double expectedResult = 10.0;
        assertEquals(expectedResult, actualResult, 0.0001);

        actualResult = rpnCalculator.evaluate("15 7 1 1 + - / 3 * 2 1 1 + + -");
        expectedResult = 5.0;
        assertEquals(expectedResult, actualResult, 0.0001);
    }
}