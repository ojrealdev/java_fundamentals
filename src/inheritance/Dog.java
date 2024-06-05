package inheritance;

public class Dog extends Animal{
    private static int legs;

    public static void main(String[] args) {
        Animal dog = new Animal();
        legs = dog.getLegs();
        System.out.println(dog.getLegs());
        System.out.println(legs);
        dog.setAge(5);
    }

    @Override
    public void makeSound() {
        setSong("tweet twet!");
        makeSound();
    }
}
