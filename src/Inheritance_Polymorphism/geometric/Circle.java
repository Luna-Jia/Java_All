package Inheritance_Polymorphism.geometric;

public class Circle extends GeometricObject { // extends superclass data fields
    private double radius;

    public Circle() { // constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled); // 必须在第一行
        //setColor(color);
        //setFilled(filled);
        this.radius = radius;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return diameter 直径
    public double getDiameter() {
        return 2 * radius;
    }

    // Return perimeter 周长
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Print the circle info
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius); // line 46 & 47 are same
    }

    // Override the toString method defined in the superclass
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return radius == ((Circle)o).radius;
        else
            return false;
    }
}
