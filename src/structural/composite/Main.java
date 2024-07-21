package structural.composite;

public class Main {
    public static void main(String[] args) {
        ArithemeticExpression two = new Number(2);
        ArithemeticExpression three = new Number(3);
        ArithemeticExpression four = new Number(4);
        ArithemeticExpression add = new Expression(three, four, Operation.ADD);
        ArithemeticExpression parent = new Expression(two, add, Operation.MULTIPLY);
        System.out.println(parent.evaluate());
    }
}
