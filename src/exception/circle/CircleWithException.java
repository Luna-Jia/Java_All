package exception.circle;
public class CircleWithException {
    private double radius; // The radius of the circle

    // The number of the objects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius 1
    public CircleWithException() {
        this(1.0);
    }

    // Construct a circle with a specified radius // a new constructor CircleWithException(newRadius) is added
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius // The setRadius method throws an exception if the radius is negative.
    public void setRadius(double newRadius) throws IllegalArgumentException { // The CircleWithException class would still compile if the throws IllegalArgumentException clause (line 25) were removed from the method declaration, since it is a subclass of RuntimeException and every method can throw RuntimeException (an unchecked exception) regardless of whether it is declared in the method header.
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
// The setRadius method declares to throw IllegalArgumentException in the method header (lines 25–31)
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double findArea() {
        return radius * radius * 3.14159;
    }
}

// This example demonstrates declaring, throwing, and catching exceptions by modifying the setRadius method
// This class defines a new circle class named CircleWithException.