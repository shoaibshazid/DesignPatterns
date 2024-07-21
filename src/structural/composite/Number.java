package structural.composite;

import java.awt.*;

public class Number implements ArithemeticExpression{

    int number;
    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is " + number);
        return number;
    }
}
