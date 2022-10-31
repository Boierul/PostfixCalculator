package Structures.Abstract;

import Structures.Implementations.CalculatorVisitor;

/**
 * Abstract class - detach implementation logic to achieve loose coupling
 */
public abstract class Token {
    private CalculatorVisitor visitor;

    public abstract void accept(CalculatorVisitor visitor);
}
