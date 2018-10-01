package com.allan.studies.strategy.calculations;

public class OperationMult implements Operation {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 * num2;
    }
}
