package celia.friday_6_22;

/**
 * Created by bcarlson on 6/22/18.
 */
public class Dog {
    public String name;
    private int weight;
    public static int totalDogs = 0;

    public Dog() {

    }

    public Dog(String name, int w) {
        this.name = name;
        weight = w;
        totalDogs += 1;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }

    public static Dog largerDog(Dog a, Dog b) {
        if (a.getWeight() > b.getWeight()) {
            return a;
        }
        return b;
    }

    /**
     * This method doesn't really make sense
     */
    public Dog largerDog(Dog b) {
        if (this.getWeight() > b.getWeight()) {
            return this;
        }
        return b;
    }

    /**
     * However, we can do this instead to make more sense
     */
    public boolean isLarger2(Dog b) {
        if (getWeight() > b.getWeight()) {
            return true;
        }
        return false;
    }

    /**
     * Same thing, but written more concisely
     */
    public boolean isLarger(Dog b) {
        return getWeight() > b.getWeight();
    }

    public static int countDogs() {
        return totalDogs;
    }

    public static void main(String[] args) {
        Dog.largerDog(a, b);
        int x = Dog.totalDogs;
        Dog d = new Dog();
        d.isLarger(b);
    }
}
