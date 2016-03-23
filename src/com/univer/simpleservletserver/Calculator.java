package com.univer.simpleservletserver;

public class Calculator {
    private double operand1;
    private double operand2;
    private CalculatorOperation operation;

    public Calculator(CalculatorOperation operation, double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public Number doMath() {
        Double result;

        switch (operation) {
            case add: {
                result = operand1 + operand2;
                break;
            }
            case sub: {
                result = operand1 - operand2;
                break;
            }
            case mul: {
                result = operand1 * operand2;
                break;
            }
            case div: {
                result = operand1 / operand2;
                break;
            }
            default: throw new UnsupportedOperationException("Wrong operation command");
        }

        if(result == Math.round(result)) {
            return Math.round(result);
        }
        return result;
    }

}
