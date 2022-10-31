import Enums.Operation;
import Structures.Implementations.Operand;
import Structures.Implementations.Operator;
import Structures.Abstract.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ClientTest {


    Client client;
    ArrayList<Token> list;
    Operand firstOperand;
    Operand secondOperand;
    Operator operator1;
    Operand thirdOperand;
    Operator operator;

    @BeforeEach
    void setUp() {
        client = new Client();
        list = new ArrayList<>();
        firstOperand = new Operand(2);
        secondOperand = new Operand(10);
        operator1 = new Operator(Operation.MULTIPLY);
        thirdOperand = new Operand(20);
        operator = new Operator(Operation.SUBTRACT);
        list.add(firstOperand);
        list.add(secondOperand);
        list.add(operator1);
        list.add(thirdOperand);
        list.add(operator);
    }

    @Test
    void evaluateExpression() {
        Assertions.assertEquals(0,client.evaluateExpression(list),"Valid Solution");
    }
}