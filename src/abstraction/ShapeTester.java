package abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 30);
        rectangle.calculateArea();
        rectangle.print("Rectangle");
    }
}
