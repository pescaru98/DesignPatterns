package behavioral.visitor.withvisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {
    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {
    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }


    public double calculateShipping() {
        return 0;
    }

    @Override
    public void accept(AtvPartVisitor atvPartVisitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(atvPartVisitor);
        }

        atvPartVisitor.visit(this);
    }
}
