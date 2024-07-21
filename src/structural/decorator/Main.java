package structural.decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza;
        pizza = new CheesDecorator(new Margerite());
        System.out.println(pizza.cost());
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.cost());
    }
}
