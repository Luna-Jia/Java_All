package objectsAndClass;
public class TestCircle { // main class
    public static void main(String[] args) { // 1. The program starts the execution from the main method. // Main method // The main class contains the main method (line 3) that creates three objects.
        // Create a circle with radius 1
        Circle circle1 = new Circle(); // 2 . The statement will create an object and assign its  reference to circle1. "new Circle()" will create an object by invoking Circle's constructor // As in creating an array, the new operator is used to create an object from the constructor: new Circle() creates an object with radius 1 (line 5),
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
//  The data fields can be accessed via the reference of the object using circle1.radius, circle2.radius, and circle3.radius, respectively.

        // Crate a circle with radius 25
        Circle circle2 = new Circle(25); // new Circle(25) creates an object with radius 25 (line 10),
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
// The object can invoke its method via the reference of the object using circle1.getArea(), circle2. getArea(), and circle3.getArea(), respectively.

        // Create a circle with radius 125
        Circle circle3 = new Circle(125);  //and new Circle(125) creates an object with radius 125 (line 15).
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());


        // Modify circle radius
        circle2.radius =100; // or circle2.setRadius(100) // The radius of circle2 is changed to 100 in line 20.
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    } // The object’s new radius and area are displayed in lines 21 and 22.
}


// Define the circle class with two constructors
class Circle { // class Circle
    double radius; // data field

    // The number of objects created
    static int numberOfObjects = 0; // static variable

    // Construct a circle with radius 1
    Circle() { // 3. The constructor is invoked to create an object. The default value for radius is 0. // no-arg constructor
        radius = 1; // 4. Value 1 is assigned to radius.
        numberOfObjects++; // increase by 1
    }

    // Construct a circle with a specified radius
    Circle (double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() { // static method
        return numberOfObjects;
    }

    // Return the area of this circle // These three objects (referenced by circle1, circle2, and circle3) have different data but the same methods. Therefore, you can compute their respective areas by using the getArea() method.
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

// https://liveexample-ppe.pearsoncmg.com/codeanimation/TestSimpleCircle.html?

// This is a program that defines the Circle class and uses it to create objects. The pro- gram constructs three circle
// objects with radius 1, 25, and 125 and displays the radius and area of each of the three circles. It then changes the
// radius of the second object to 100 and displays its new radius and area.

//The program contains two classes. The first of these, TestCircle, is the main class. Its sole purpose is to test the
// second class, Circle. Such a program that uses the class is often referred to as a client of the class. When you run
// the program, the Java runtime system invokes the main method in the main class.

// You can put the two classes into one file, but only one class in the file can be a public class. Furthermore, the
// public class must have the same name as the file name. Therefore, the file name is TestCircle.java, since TestCircle
// is public.










