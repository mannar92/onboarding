package com.amdocs;

import java.util.Stack;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RPNCalculator {

    private Stack<Double> numberStack;
    private double firstNumber, secondNumber, result;

    public RPNCalculator(){

        numberStack = new Stack<Double>();
        firstNumber = secondNumber = result = 0.0;

    }

    private boolean isMathOperator (String token){
        String mathOperators = "+-*/";
        return mathOperators.contains(token);
    }

    @WebMethod
    public double evaluate(String rpnMathExpression){

        String[] rpnTokens = rpnMathExpression.split(" ");
        IMathOperation mathOperator = null;


        for ( String token:rpnTokens ) {

            if ( isMathOperator (token)) {
                extractInputs();
                mathOperator = MathFactory.getObject(token);
                result = mathOperator.evaluate(firstNumber, secondNumber);
                numberStack.push(result);
            }

/*
            if ( token.equals("+")){
                add();
            } else if( token.equals("-") ) {
                subtract();
            } else if ( token.equals("*") ) {
                multiply();
            } else if ( token.equals("/") ) {
                divide();
            } 
*/
            else {

                numberStack.push(Double.parseDouble(token)); 

            }
        }

        return numberStack.pop();
    
    }

    private void add () {
       extractInputs();
       result = firstNumber + secondNumber;
       numberStack.push(result);
    }

    private void subtract () {
        extractInputs();
        result =  secondNumber - firstNumber;
        numberStack.push(result);
    }

    private void multiply () {
        extractInputs();
        result = firstNumber * secondNumber;
        numberStack.push(result);
    }

    private void divide () {
        extractInputs();
        result = secondNumber/firstNumber;
        numberStack.push(result);
    }


    private void extractInputs() {
        firstNumber = numberStack.pop();
        secondNumber = numberStack.pop();
    }
}