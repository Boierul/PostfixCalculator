import Structures.Implementations.Node;
import Structures.Implementations.Operand;
import Structures.Abstract.Token;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node<Token> node;
    private Node<Token> next;

    @BeforeEach
    void setUp() {
        node = new Node<Token>();
        next = new Node<Token>();
    }

    @Test
    void setData() {
        node.setData(new Operand(20));
        assertEquals(((Operand) node.getData()).getValue(), 20);
        node.setData(new Operand(10));
        assertEquals(((Operand) node.getData()).getValue(), 10);
    }

    @Test
    void getData() {
        node.setData(new Operand(20));
        assertEquals(((Operand) node.getData()).getValue(), 20);
    }

    @Test
    void setNext() {
        node.setData(new Operand(20));
        next.setData(new Operand(10));
        assertEquals(((Operand) node.getData()).getValue(), 20);
        node.setNext(next);
        assertEquals(node.getNext(), next);
    }

    @Test
    void getNext() {
        node.setData(new Operand(20));
        next.setData(new Operand(10));
        assertEquals(((Operand) node.getData()).getValue(), 20);
        node.setNext(next);
        assertEquals(node.getNext(), next);
    }
}