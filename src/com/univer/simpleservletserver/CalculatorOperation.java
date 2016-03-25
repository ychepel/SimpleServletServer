package com.univer.simpleservletserver;

public enum CalculatorOperation {
    ADD("add"), SUB("sub"), MUL("mul"), DIV("div");

    private String command;
    CalculatorOperation(String command) {
        this.command = command;
    }

    public static CalculatorOperation findByCommand(String command) {
        for(CalculatorOperation operation : CalculatorOperation.values()) {
            if(operation.command.equals(command)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("No such command operation.");
    }
}
