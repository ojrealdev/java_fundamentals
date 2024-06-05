package inheritance;


public class Square extends Rectange {

    private int side;

    public Square() {
        super(50, 50);
    }


    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void display() {
        System.out.println("Run the overrided function");
        System.out.println("The square area is: " + this.getArea());
    }

    public String display(String txt) {
        System.out.println("Overloaded function");
        return txt;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
