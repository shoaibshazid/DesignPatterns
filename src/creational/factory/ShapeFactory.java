package creational.factory;

public class ShapeFactory {
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }else{
            return null;
        }
    }
}
