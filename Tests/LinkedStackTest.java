import Structures.Implementations.LinkedStack;
import Structures.Implementations.Operand;
import Structures.Abstract.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    LinkedStack<Token> linkedStack;

    @BeforeEach
    void setUp() {
        linkedStack = new LinkedStack<>();
    }

    @Test
    void isEmpty() {
        assertTrue(linkedStack.isEmpty());
        linkedStack.push(new Operand(10));
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    void push() {
        assertTrue(linkedStack.isEmpty());
        linkedStack.push(new Operand(10));
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    void pop() {
        linkedStack.push(new Operand(10));
        assertFalse(linkedStack.isEmpty());
        linkedStack.pop();
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void popException() throws EmptyStackException {
        Assertions.assertThrows(EmptyStackException.class, ()-> linkedStack.pop());
    }
}