package Structures.Interfaces;

import Exceptions.EmptyListException;

/**
 * Interface which acts as an ADT (Abstract Data Structure)
 *
 * @param <T> generic data type
 */
public interface List<T> {
    boolean isEmpty();

    int size();

    void addToFront(T data);

    T removeFirst() throws EmptyListException;
}
