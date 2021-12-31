package objectsAndClass;
public class CircleWithPrivateDataFields {
    // The radius of the circle // data field
    private double radius = 1; // encapsulate radius

    // The number of objects created
    private static int numberOfObjects = 0; // encapsulate numberOfObjects

    // Construct a circle with radius 1
    public CircleWithPrivateDataFields() { // constructor 1
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double newRadius) { // constructor 2
        radius = newRadius;
        numberOfObjects++;
    }

    // getter: return radius
    public double getRadius() {
        return radius;
    }

    // setter:  sets a new radius for the object.
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius: 0; // If the new radius is negative, 0 is set as the radius for the object.
    } //  Since these methods are the only ways to read and modify the radius, you have total control over how the radius
    // property is accessed. If you have to change the implementation of these methods, you don’t need to change the
    // client programs. This makes the class easy to maintain.

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // return the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}