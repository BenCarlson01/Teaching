package celia.friday_6_22;

/**
 * Created by bcarlson on 6/22/18.
 */
public class Main {

    public static void main(String[] args) {
        //dogExample();
        GRoEExample();
    }

    public static void dogExample() {
        Dog max;
        max = new Dog("Max", 10);

        Dog charlie = new Dog("Charlie", 20);

        Dog[] dogs = new Dog[3];
        System.out.println(dogs[0] + " "
                + dogs[1] + " "
                + dogs[2]);

        System.out.println("Total dogs: "
                + Dog.countDogs() + ", "
                + max.countDogs() + ", "
                + charlie.countDogs());

        dogs[0] = new Dog("Bella", 30);
        dogs[1] = new Dog("Lucy", 40);
        dogs[2] = new Dog("Daisy", 50);
        System.out.println("Total dogs: " + Dog.countDogs());

        System.out.println(Dog.largerDog(max, charlie).name);
        System.out.println(max.largerDog(max, charlie).name); //Does this make sense?
        System.out.println(max.isLarger(charlie));
    }

    public static void GRoEExample() {
        int x = 10;
        int y = 15;
        System.out.println("x: " + x + ",y: " + y);
        System.out.println("x == y: " + (x == y));
        x = y;
        System.out.println("x: " + x + ",y: " + y);
        System.out.println("x == y: " + (x == y));
        int z = 15;
        System.out.println("x: " + x + ",z: " + z);
        System.out.println("x == z: " + (x == z));
        String dog = "dog";
        String dog2 = "dog";
        System.out.println();

        Walrus harry = new Walrus("Harry", 150, 6);
        Walrus jerry = new Walrus("Jerry", 2000, 6);
        System.out.println(harry.toString() + ", " + jerry.toString());
        System.out.println("harry == jerry: " + (harry == jerry));
        System.out.println("harry.equals(jerry): " + harry.equals(jerry));
        harry.weight = 2000;
        System.out.println(harry.toString() + ", " + jerry.toString());
        System.out.println("harry == jerry: " + (harry == jerry));
        System.out.println("harry.equals(jerry): " + harry.equals(jerry));
        harry = jerry;
        System.out.println(harry.toString() + ", " + jerry.toString());
        System.out.println("harry == jerry: " + (harry == jerry));
        System.out.println("harry.equals(jerry): " + harry.equals(jerry));
    }
}
