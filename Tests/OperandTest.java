import Structures.Implementations.Operand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    Operand operand;

    @BeforeEach
    void setUp() {
        operand = new Operand(10);
    }

    @Test
    @DisplayName("Operand Getter Test")
    void getValue() {
        assertEquals(10, operand.getValue(),
                "Operand getter is working");
    }
}