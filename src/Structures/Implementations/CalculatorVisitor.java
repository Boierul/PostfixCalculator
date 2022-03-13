package Structures.Implementations;

import Exceptions.MalformedExpressionException;
import Structures.Interfaces.Calculator;
import Structures.Interfaces.Visitor;
import Structures.Token;

import java.util.EmptyStackException;

public class CalculatorVisitor implements Visitor, Calculator {

    private final LinkedStack<Token> tokenStack = new LinkedStack<>();

    public void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

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

    @Override
    public int getResult() throws MalformedExpressionException {
        if (tokenStack.isEmpty())
            throw new MalformedExpressionException("The expression is broken");

        Operand result = (Operand) tokenStack.pop();
        return result.getValue();
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        try {
            performOperation(operator);
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
    }
}
