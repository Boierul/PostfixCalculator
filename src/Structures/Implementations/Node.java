package Structures.Implementations;

public class Node<T> {

    private T data;
    private Node<T> next;

//    public Node() {
//        this.data = null;
//        this.next = null;
//    }

//    public Node(T data, Node next) {
//        this.data = data;
//        this.next = next;
//    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Structures.Implementations.Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
