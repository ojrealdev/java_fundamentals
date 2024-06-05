package abstraction;

public abstract class Shape {
    abstract void calculateArea();

    public void print(String shape) {
        System.out.println("I am a " + shape);
    }
}
