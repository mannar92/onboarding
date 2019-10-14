package com.amdocs;

import java.util.Stack;

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

    public double evaluate(String rpnMathExpression){

        String[] rpnTokens = rpnMathExpression.split(" ");
        IMathOperation mathOperator = null;


        for ( String token:rpnTokens ) {

            if ( isMathOperator (token)) {

                extractInputs();
                mathOperator = MathFactory.getObject(token);
                result = mathOperator.evaluate(firstNumber, secondNumber);
                numberStack.push(result);
                
            } else {

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