package structural.bridge.withoutbridge;

/**
 * The problem is, everytime when we add another colored square or circle, we got to make a class implementing applyColor
 */
public class WithoutBridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();


        circle.applyColor();
        square.applyColor();
    }
}
