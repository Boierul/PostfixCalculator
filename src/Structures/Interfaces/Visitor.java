package Structures.Interfaces;

import Structures.Implementations.Operator;
import Structures.Implementations.Operand;


public interface Visitor {
    void visit(Operand operand);
    void visit(Operator operator);
}
