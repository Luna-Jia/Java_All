package abstractClass_Interfaces.geometric;

public class Circle extends GeometricObject {

    // Data field
    private double radius;

    // Default constructor
    Circle() {
    }

    // Second constructor with one perimeter radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Return radius
    double getRadius() {
        return radius;
    }

    // Set a new radius
    void setRadius(double radius) {
        this.radius = radius;
    }

    // Return area
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return diameter 直径
    double getDiameter() {
        return 2 * radius;
    }

    // Return perimeter 周长
    @Override
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Print the circle info
    void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
