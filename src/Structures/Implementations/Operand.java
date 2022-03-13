package Structures.Implementations;

import Structures.Token;

public class Operand extends Token {

    private final int value;

    public Operand(int value) {
        this.value = value;
    }

    public void accept(CalculatorVisitor calculatorVisitor)
    {
        calculatorVisitor.visit(this);
    }

    public int getValue()
    {
        return value;
    }
}
