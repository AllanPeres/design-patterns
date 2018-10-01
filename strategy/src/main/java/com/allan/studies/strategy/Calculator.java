package com.allan.studies.strategy;

import com.allan.studies.strategy.calculations.Operation;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double executeOperation(double num1, double num2) {
        try {
            return this.operation.doOperation(num1, num2);
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
