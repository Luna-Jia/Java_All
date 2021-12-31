package objectsAndClass;
public class Test {
    public static void main(String[] args) {
// Create an object
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}

// You can pass objects to methods. Like passing an array, passing an object is actually passing the reference of the
// object. This code passes the myCircle object as an argument to the printCircle method.
