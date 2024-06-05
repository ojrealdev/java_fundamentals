package inheritance;

public class InheritanceTester {

    public static void main(String[] args) {
       // Employee employee = new Employee("Johne Doe", "MSI303030", "Software Engineer");

        Square sq = new Square();
        Rectange rct = new Rectange(10, 20);

        sq.setSide(5);

        sq.display();
        //rct.display();

    }
}
