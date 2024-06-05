package abstraction;

public class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    @Override
    void calculateArea() {
        var area = this.length * this.width;
        System.out.println("Length: " + this.length + " Width: " + width);
        System.out.println("Area: " + area);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
