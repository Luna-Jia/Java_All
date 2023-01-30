package objectsAndClass;
public class AlternativeCircle {
    public static void main(String[] args) { // Main method
        // Create a circle with radius 1
        AlternativeCircle circle1 = new AlternativeCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is "+ circle1.getArea());


        // Create a circle with radius 25
        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());


        // Create a circle with radius 125
        AlternativeCircle circle3 = new AlternativeCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());


        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }


    double radius;

    // Construct a circle with radius 1
    AlternativeCircle() {
        radius = 1;
    }

    // Construct a circle with a specified radius
    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    // Return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the perimeter of this circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Set a new radius for this circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/SimpleCircleWithLineNumber.html?

// Since the combined class has a main method, it can be executed by the Java interpreter. The main method is the same
// as that in Listing 9.1. This demonstrates that you can test a class by simply adding a main method in the same class.