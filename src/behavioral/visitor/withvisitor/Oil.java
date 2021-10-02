package behavioral.visitor.withvisitor;

/**
 * This is "ConcreteElement"
 */
public class Oil implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
