import Exceptions.MalformedExpressionException;
import Structures.Implementations.CalculatorVisitor;
import Structures.Abstract.Token;

import java.util.ArrayList;

/**
 * Class that represents the end-user
 */
public class Client {
    /**
     * Method that evaluates the validity of the mathematical expression
     *
     * @param tokenList the
     * @return the result of the operation || 0 (if the calculator has no operations)
     */
    public int evaluateExpression(ArrayList<Token> tokenList) {
        CalculatorVisitor calculatorVisitor =
                new CalculatorVisitor();

        for (Token token : tokenList) {
            token.accept(calculatorVisitor);
        }

        try {
            return calculatorVisitor.getResult();
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
