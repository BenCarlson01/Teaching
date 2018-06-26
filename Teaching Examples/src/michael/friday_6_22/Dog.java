package michael.friday_6_22;

/**
 * Created by bcarlson on 6/22/18.
 */
public class Dog {
    public String hat; //You can put whatever hat you want on a dog
    public String nickname; //Maybe you can even call a dog whatever name you want
    private String name; //However, they probably only have one official name
    private int age; //You can't just change a dog's age
    private int weight; //You can't just change a dog's weight

    public Dog(String hat, String nn, String n, int age, int w) {
        this.hat = hat;
        nickname = nn;
        name = n;
        this.age = age;
        weight = w;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void getOlder() {
        age += 1;
    }

    public void eatFood(String meal) {
        if (isFood(meal)) {
            weight += 5;
        } else {
            System.out.println("Reject");
        }
    }

    private boolean isFood(String meal) {
        return meal.equals("dog_food")
                || meal.equals("steak")
                || meal.equals("bone");
    }
}
