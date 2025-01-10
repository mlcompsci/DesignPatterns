package DesignPatterns;

public class FacadePatternDemo {
    public static void main(String[] args) {
        // Create a new ShapeMaker object.
        ShapeMaker shapeMaker = new ShapeMaker();
        // Call all three methods.
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
