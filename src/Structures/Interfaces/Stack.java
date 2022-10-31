package Structures.Interfaces;

import Exceptions.EmptyListException;

import java.util.EmptyStackException;

/**
 * Interface which acts as an ADT (Abstract Data Structure)
 *
 * @param <T> generic data type
 */
public interface Stack<T> {
    boolean isEmpty();

    void push(T element);

    T pop() throws EmptyStackException;
}
