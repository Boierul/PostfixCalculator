package Structures.Interfaces;

import Exceptions.MalformedExpressionException;

/**
 * Interface of the calculator object
 */
public interface Calculator {
    int getResult() throws MalformedExpressionException;
}
