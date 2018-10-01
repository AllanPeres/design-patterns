package com.allan.studies.strategy.calculations;

public class OperationDiv implements Operation {

    @Override
    public double doOperation(double num1, double num2) throws ArithmeticException {
        return num1 / num2;
    }
}
