package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet<String>();
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Watermelon");

        var i = fruits.iterator();
        while (i.hasNext()) {}

        System.out.println(fruits);
        System.out.println("Fruits Size: " + fruits.size());
        System.out.println("Contains Lemon: " + fruits.contains("Lemon"));
        System.out.println("Remove Lemon: " + fruits.remove(0));
        System.out.println("Contains Lemon: " + fruits.contains("Lemon"));
        System.out.println(fruits.toArray());
    }

    public static void listDemo() {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Pineapple");

//        Iterate over list of fruits
        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " Equals Appl: " + i.equals("Apple"));
        }

//        System.out.println(fruits);
//        System.out.println("Fruits Size: " + fruits.size());
//        System.out.println("Fruits Contains Apple: " + fruits.contains("Apple"));
//        System.out.println("Fruits Remove Apple: " + fruits.remove("Apple"));
//        System.out.println("Fruits Contains Apple: " + fruits.contains("Apple"));
//        fruits.add("Onger");
//        System.out.println(fruits.lastIndexOf("fruits"));
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.forEach(fruit -> {
            System.out.println(fruit);
        });

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.add("Lemon"));
        System.out.println(fruits.add("Lemon"));
        var removed = fruits.remove();
        System.out.println(fruits);
        System.out.println("Removed: " + removed);

    }

    public static void mapDemo() {
        Map<String, Integer> fruits = new HashMap<String, Integer>();
        fruits.put("Lemon", 3);
        fruits.put("Pineaple", 5);
        fruits.put("Orange", 4);

        fruits.forEach((fruit, value) -> {
            System.out.println("Name: " + fruit + " In Store: " + value);
        });

//        System.out.println(fruits.size());
        System.out.println(fruits.get("Lemon"));
//        System.out.println(fruits);
//        fruits.putIfAbsent("Lemon", 8);
//        System.out.println(fruits);
    }

}

