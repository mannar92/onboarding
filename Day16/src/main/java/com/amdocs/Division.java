package com.amdocs;

public class Division implements IMathOperation {

    @Override
    public double evaluate(double firstNumber, double secondNumber) {
        return secondNumber / firstNumber;
    }
}