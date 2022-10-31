package Structures.Implementations;

/**
 * Class representation of a node
 *
 * @param <T> generic data type
 * @author Boierul
 */
public class Node<T> {

    /**
     * The payload data
     */
    private T data;
    /**
     * Unilateral pointer - indicates the next node.
     */
    private Node<T> next;

    /**
     * Setter method
     *
     * @param data generic data type object
     */
    public void setData(T data) {
        this.data = data;
    }


    /**
     * Getter method
     *
     * @return the current data in the node
     */
    public T getData() {
        return data;
    }

    /**
     * Setter method - set the next node pointer
     *
     * @param node Node object with generic data type object
     */
    public void setNext(Node<T> node) {
        this.next = node;
    }

    /**
     * Getter method - indicate the next node
     *
     * @return the current data in the node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * General toString method
     */
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
