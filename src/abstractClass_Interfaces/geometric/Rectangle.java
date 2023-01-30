package abstractClass_Interfaces.geometric;

public class Rectangle extends GeometricObject {

    // Data field
    private double width;
    private double height;

    // default constructor with no argument
    Rectangle() {
    }

    // Second constructor with two arguments
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Return width
    double getWidth() {
        return width;
    }

    // Set a new width
    void setWidth(double width) {
        this.width = width;
    }

    // Return height
    double getHeight() {
        return height;
    }

    // Set a new height
    void setHeight(double height) {
        this.height = height;
    }

    // Return area
    @Override
    public double getArea() {
        return width * height;
    }

    // Return perimeter 周长
    double getPerimeter() {
        return 2 * (width + height);
    }
}
