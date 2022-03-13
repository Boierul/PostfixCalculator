package Exceptions;

/**
 * Exception when the solicited list is Empty
 * @author Dan
 */
public class EmptyListException extends Exception{
    public EmptyListException(String message) {
        super(message);
    }
}

