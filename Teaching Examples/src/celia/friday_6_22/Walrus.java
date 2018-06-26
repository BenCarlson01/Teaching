package celia.friday_6_22;

/**
 * Created by bcarlson on 6/22/18.
 */
public class Walrus {
    public int weight, tusks;
    public String name;

    public Walrus(String name, int weight, int tusks) {
        this.name = name;
        this.weight = weight;
        this.tusks = tusks;
    }

    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        Walrus b = (Walrus) obj;
        return weight == b.weight && tusks == b.tusks;
    }

    public boolean equals(Walrus b) {
        return weight == b.weight && tusks == b.tusks;
    }

    @Override
    public String toString() {
        return "{name = " + name + ", weight = " + weight + ", tusks = " + tusks + "}";
    }
}
