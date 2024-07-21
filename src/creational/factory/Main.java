package creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeObject = new ShapeFactory();
        Shape shape = shapeObject.getShape("circle");
        shape.draw();
    }
}
