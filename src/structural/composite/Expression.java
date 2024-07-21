package structural.composite;

public class Expression implements ArithemeticExpression{
    ArithemeticExpression leftExpression;
    ArithemeticExpression rightExpression;
    Operation operation;

    public Expression(ArithemeticExpression leftExpression, ArithemeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = switch (operation) {
            case ADD -> leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT -> leftExpression.evaluate() - rightExpression.evaluate();
            case DIVIDE -> leftExpression.evaluate() / rightExpression.evaluate();
            case MULTIPLY -> leftExpression.evaluate() * rightExpression.evaluate();
        };
        System.out.println("Expression value is :" + value);
        return value;
    }
}
