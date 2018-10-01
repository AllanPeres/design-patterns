package com.allan.studies.strategy;

import com.allan.studies.strategy.calculations.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("params")
    public void tests(double num1, double num2, Operation operation, double answer) {
        calculator.setOperation(operation);
        assertEquals(answer, calculator.executeOperation(num1, num2));
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(10, 10, new OperationAdd(), 20),
                Arguments.of(20, 10, new OperationSub(), 10),
                Arguments.of(20, 2, new OperationDiv(), 10),
                Arguments.of(5, 2, new OperationMult(), 10)
        );
    }

}
