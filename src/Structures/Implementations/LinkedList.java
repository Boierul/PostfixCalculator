package Structures.Implementations;

import Exceptions.EmptyListException;
import Structures.Interfaces.List;

/**
 * Custom linked list class
 *
 * @param <T> generic data type
 * @author Boierul
 */
public class LinkedList<T> implements List<T> {

    /**
     * Unilateral pointer - indicates the last node object
     */
    private Node<T> head;
    /**
     * Integer field - indicates the size of the linked list
     */
    private int size;

    /**
     * Content validator method
     *
     * @return true if the linked list is empty
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Size validator method
     *
     * @return the current size of the linked list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Adds the object at the top of the linked list
     *
     * @param data generic data type
     */
    @Override
    public void addToFront(T data) {
        Node<T> node = new Node<>();

        node.setData(data);
        node.setNext(head);

        head = node;
        size++;
    }

    /**
     * Removes the last object in the linked list
     *
     * @return the new copy of the linked list
     * @throws EmptyListException if the linked list is empty
     */
    @Override
    public T removeFirst() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("The list is empty");
        }

        Node<T> node = head;
        head = head.getNext();

        size--;
        return node.getData();
    }

    /**
     * General toString method
     */
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head.toString() +
                ", size=" + size +
                '}';
    }
}
