package Structures.Implementations;

import Enums.Operation;
import Structures.Token;

public class Operator extends Token {
    private final Operation operation;

    public Operator(Operation operation) {
        this.operation = operation;
    }

    public void accept(CalculatorVisitor calculatorVisitor) {
        calculatorVisitor.visit(this);
    }

    public Operation getSpecialOperation() {
        return operation;
    }
}
