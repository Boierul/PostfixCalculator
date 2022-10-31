package Structures.Implementations;

import Enums.Operation;
import Structures.Abstract.Token;

/**
 * Class that represents the operator (the mathematical operation) in the postfix calculator
 *
 * @author Boierul
 */
public class Operator extends Token {
    private final Operation operation;

    /**
     * Constructor: Initialized with the value (dependency injection)
     *
     * @param operation constructs the operator object
     */
    public Operator(Operation operation) {
        this.operation = operation;
    }

    public void accept(CalculatorVisitor calculatorVisitor) {
        calculatorVisitor.visit(this);
    }

    /**
     * Getter method - indicate the available operation
     *
     * @return the selected operation
     */
    public Operation getSpecialOperation() {
        return operation;
    }
}
