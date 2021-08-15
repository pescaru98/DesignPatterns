package structural.decorator;

/**
 * -> ConcreteComponent <-
 * This is the concrete implementation of sandwich.
 * The interface "Sandwich" and this class, "SimpleSandwich" are considered as starting class.
 * Afterwards, we add a decorator and a concrete decorator to add new functionalities to the "make()" method
 */
public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "Bread";
    }
}
