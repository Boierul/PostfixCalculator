import Enums.Operation;
import Structures.Implementations.Operator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    Operator operator;

    @BeforeEach
    void setUp() {
        operator = new Operator(Operation.ADD);
    }

    @Test
    @DisplayName("Operator Getter Test")
    void getOperationValue() {
        assertEquals(Operation.ADD, operator.getSpecialOperation(),
                "Operand getter is working");
    }
}