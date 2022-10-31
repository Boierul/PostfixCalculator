package Exceptions;


/**
 * Incorrect syntax exception
 *
 * @author Boierul
 */
public class MalformedExpressionException extends Exception {
    public MalformedExpressionException(String message) {
        super(message);
    }
}
