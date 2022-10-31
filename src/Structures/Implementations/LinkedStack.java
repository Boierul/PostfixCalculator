package Structures.Implementations;

import Exceptions.EmptyListException;
import Structures.Interfaces.Stack;

import java.util.EmptyStackException;

/**
 * A stack implemented via linked lists
 *
 * @param <T> generic data type
 * @author Boierul
 */
public class LinkedStack<T> implements Stack<T> {

    /**
     * Instantiates the linked list object
     */
    private final LinkedList<T> list = new LinkedList<>();

    /**
     * Content validator method
     *
     * @return true if the linked list is empty
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Adds the object at the top of the linked list
     *
     * @param element generic data type
     */
    @Override
    public void push(T element) {
        list.addToFront(element);
    }

    /**
     * Removes the last object in the stack
     *
     * @return the object that was deleted
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public T pop() throws EmptyStackException {
        try {
            return list.removeFirst();
        } catch (EmptyListException e) {
            throw new EmptyStackException();
        }
    }
}
