package structural.decorator;

public class MushroomDecorator extends ToppingDecorator{

    BasePizza basePizza;
    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return  basePizza.cost() + 1;
    }
}
