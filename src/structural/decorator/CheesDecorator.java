package structural.decorator;

public class CheesDecorator extends ToppingDecorator{

    BasePizza basePizza;
    public CheesDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 1;
    }
}
