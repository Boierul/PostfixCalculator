import Exceptions.EmptyListException;
import Structures.Implementations.LinkedList;
import Structures.Implementations.Operand;
import Structures.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<Token> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<Token>();
    }

    @Test
    void isEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(new Operand(10));
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, linkedList.size());
        linkedList.addToFront(new Operand(10));
        assertEquals(1, linkedList.size());
    }

    @Test
    void addToFront() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(new Operand(10));
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void removeFirst() throws EmptyListException {
        linkedList.addToFront(new Operand(10));
        assertFalse(linkedList.isEmpty());
        linkedList.removeFirst();
        assertTrue(linkedList.isEmpty());
        Assertions.assertThrows(EmptyListException.class, ()
                -> {linkedList.removeFirst();});
    }

    @Test
    void removeFirstException() {
        Assertions.assertThrows(EmptyListException.class, ()-> linkedList.removeFirst());
    }
}