package com.amdocs;

public class Multiplication implements IMathOperation {

    @Override
    public double evaluate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}