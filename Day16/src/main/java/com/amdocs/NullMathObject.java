package com.amdocs;

public class NullMathObject implements IMathOperation { 

    @Override
    public double evaluate(double firstNumber, double secondNumber) { 
        System.out.println("Unsupported math operation");
        return 0;
    }
}