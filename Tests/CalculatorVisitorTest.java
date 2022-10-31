import Enums.Operation;
import Exceptions.MalformedExpressionException;
import Structures.Implementations.CalculatorVisitor;
import Structures.Implementations.Operand;
import Structures.Implementations.Operator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    CalculatorVisitor calculatorVisitor;

    @BeforeEach
    void setUp() {
        calculatorVisitor = new CalculatorVisitor();
    }

    @Test
    void getResult() throws MalformedExpressionException {
        assertThrows(MalformedExpressionException.class , () -> calculatorVisitor.getResult());
        calculatorVisitor.visit(new Operand(10));
        calculatorVisitor.visit(new Operand(20));
        calculatorVisitor.visit(new Operator(Operation.ADD));
        assertEquals(30,calculatorVisitor.getResult());
    }

    @Test
    void visit() throws MalformedExpressionException {
        calculatorVisitor.visit(new Operand(30));
        calculatorVisitor.visit(new Operand(10));
        calculatorVisitor.visit(new Operator(Operation.DIVIDE));
        assertEquals(3,calculatorVisitor.getResult());

    }
}