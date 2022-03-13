package Structures.Implementations;

import Exceptions.EmptyListException;
import Structures.Interfaces.List;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    @Override
    public boolean isEmpty() {
        // size == null
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> node = new Node<>();

        node.setData(data);
        node.setNext(head);

        head = node;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("The list is empty");
        }

        Node<T> node = head;
        head = head.getNext();

        size--;
        return node.getData();
//        Node<T> node = new Node<>();
//        if (head.getNext() == null) {
//            node.setData(head.getData());
//            head = null;
//        } else {
//            node = head.getNext();
//            head = node;
//        }
    }
}
