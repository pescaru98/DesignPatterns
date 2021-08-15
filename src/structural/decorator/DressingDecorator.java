package structural.decorator;

/**
 * -> ConcreteDecorator <-
 */
public class DressingDecorator extends SandwichDecorator{

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return make() + addDressing();
    }

    private String addDressing(){
        return " + mustard";
    }
}
