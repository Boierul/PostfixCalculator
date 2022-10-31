package Structures.Implementations;

import Exceptions.MalformedExpressionException;
import Structures.Abstract.Token;
import Structures.Interfaces.Calculator;
import Structures.Interfaces.Visitor;

import java.util.EmptyStackException;

/**
 * Class implementation of the calculator
 * The class is using visitor design pattern to make the application loosely coupled
 * and subsequently easily maintainable in the future
 * Follows SOLID - O/C principle
 *
 * @author Boierul
 */
public class CalculatorVisitor implements Visitor, Calculator {

    /**
     * Field that instantiates a new stack
     */
    private final LinkedStack<Token> tokenStack = new LinkedStack<>();

    /**
     * Method that pushes the Operand in the stack
     *
     * @param operand the number input wrapped inside an Operand class
     */
    public void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    /**
     * Method validator - Checks if the requested operation is available
     * Pushes the Operand in the stack
     *
     * @param operator the operation name
     * @throws MalformedExpressionException if some unhandled error occurs
     */
    public void performOperation(Operator operator) throws MalformedExpressionException {
        try {
            Operand firstOperand = (Operand) tokenStack.pop();
            Operand secondOperand = (Operand) tokenStack.pop();

            switch (operator.getSpecialOperation()) {
                case ADD -> tokenStack.push(new Operand(secondOperand.getValue()
                        + firstOperand.getValue()));
                case SUBTRACT -> tokenStack.push(new Operand(secondOperand.getValue()
                        - firstOperand.getValue()));
                case MULTIPLY -> tokenStack.push(new Operand(secondOperand.getValue()
                        * firstOperand.getValue()));
                case DIVIDE -> tokenStack.push(new Operand(secondOperand.getValue()
                        / firstOperand.getValue()));
            }
        } catch (EmptyStackException e) {
            throw new MalformedExpressionException("The expression is malformed");
        }
    }

    /**
     * Getter method
     *
     * @return the result of the calculation which is now top of the stack
     * @throws MalformedExpressionException if some unhandled errors occurs
     */
    @Override
    public int getResult() throws MalformedExpressionException {
        if (tokenStack.isEmpty())
            throw new MalformedExpressionException("The expression is broken");

        Operand result = (Operand) tokenStack.pop();
        return result.getValue();
    }

    /**
     * Implementation of the abstract method
     * Acts as a wrapper to achieve loose coupling
     *
     * @param operand the number input wrapped inside an Operand class
     */
    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    /**
     * Implementation of the abstract method
     * Acts as a wrapper to achieve loose coupling
     *
     * @param operator the mathematical operation wrapped inside an Operator class
     */
    @Override
    public void visit(Operator operator) {
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }
}
