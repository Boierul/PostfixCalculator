package Structures.Interfaces;

import Structures.Implementations.Operator;
import Structures.Implementations.Operand;


/**
 * Visitor interface (Visitor Pattern) - a way of separating the algorithm from an object structure on which it operates.
 * Grants the ability to add new operations to existing object structures without modifying the already existing structures.
 */
public interface Visitor {
    void visit(Operand operand);

    void visit(Operator operator);
}
