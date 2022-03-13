package Structures.Implementations;

import Exceptions.EmptyListException;
import Structures.Interfaces.Stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T element) {
        list.addToFront(element);
    }

    @Override
    public T pop() throws EmptyStackException {
//        if (isEmpty())
//            throw new EmptyStackException();
//
//        return list.removeFirst();
        try {
            return list.removeFirst();
        } catch (EmptyListException e)
        {
            throw new EmptyStackException();
        }
    }
}
