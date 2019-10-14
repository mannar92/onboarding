package com.amdocs;

public class Addition implements IMathOperation {

    @Override
    public double evaluate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}