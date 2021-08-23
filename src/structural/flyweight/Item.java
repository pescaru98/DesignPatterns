package structural.flyweight;

/**
 * Instances of Item will be the Flyweights.
 * The flyweights comes as an optimisation for the high number of created objects.
 * Example String class, which maps multiple strings that has the same value into one, so it's good for memory management
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
