package won.sunday_6_24; //A package is similar to a folder

/**
 * This is a comment. Usually you describe what the class/method/variable does here.
 */
public class Dog { //This is how you create a new class. Almost all classes you create will follow this format

    public String name; //Class variable
    private int weight; //Also a class variable

    public Dog() { //Constructor with no parameter
        name = "Max"; //Assignment statement
        weight = 25;
    }

    public Dog(String name, int weight) { //Constructor with two parameters
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() { //Method that returns an int
        return weight;
    }

    public void setWeight(int weight) { //Method that returns nothing
        this.weight = weight;
    }

    public static void bark() { //Static method
        System.out.println("Bark!"); //Print statement
    }

    public static void main(String[] args) { //Main method. Java knows to run this first when the program starts
        Dog max; //Instantiates a new dog variable
        max = new Dog(); //Assigns max to a dog object
        max.getWeight(); //max calls a method. This is a non-static method call
        Dog.bark(); //Calls the method bark() in the Dog class. This is a static method call
    }
}
