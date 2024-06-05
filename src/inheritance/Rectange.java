package inheritance;

public class Rectange {
    private int width;
    private int height;

    // parameterized constructor
   Rectange(int width, int height) {
       this.width = width;
       this.height = height;
   }

    public int getArea() {
        return width * height;
    }

    public void display() {
        System.out.println("Rectangle area is: " + this.getArea());
    }

}
