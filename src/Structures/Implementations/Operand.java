package Structures.Implementations;

import Structures.Abstract.Token;

/**
 * Class that represents the operand (the input number) in the postfix calculator
 *
 * @author Boierul
 */
public class Operand extends Token {

    /**
     * The value of the initialized operand
     */
    private final int value;

    /**
     * Constructor: Initialized with the value (dependency injection)
     *
     * @param value constructs the operand object
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * @param calculatorVisitor the
     */
    public void accept(CalculatorVisitor calculatorVisitor) {
        calculatorVisitor.visit(this);
    }

    /**
     * Getter method
     *
     * @return the value of the operand
     */
    public int getValue() {
        return value;
    }
}
