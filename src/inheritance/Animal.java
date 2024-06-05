package inheritance;

public class Animal {
    private int legs = 4;
    private int age = 5;

    private String song;


    public void makeSound() {
        System.out.println(this.song);
    }

    protected int getLegs() {
        System.out.println("Legs: " + legs);
        return legs;
    }
    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        System.out.println("Age is: " + age);
        this.age = age;
    }

    protected void setSong(String song) {
        this.song = song;
        System.out.println(this.song);
    }
}
