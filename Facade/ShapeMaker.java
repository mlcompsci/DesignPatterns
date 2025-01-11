package Facade;

public class ShapeMaker {
    // Instance attributes for ShapeMaker
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        // The constructor
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    // Define the methods for the class.
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
