package Inheritance_Polymorphism.geometric;

public class CastingDemo {

    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new Circle(1); // implicit casting
        Object object2 = new Rectangle(1,1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    // A method for displaying an object
    public static void displayObject(Object object) { // generic programming
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)object).getArea()); // Explicit casting
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea()); // Explicit casting
        }
    }
}

// The displayObject(Object object) method is an example of generic programming.It can be invoked by passing any instance of Object.
//The program uses implicit casting to assign a Circle object to object1 and a Rectangle object to object2 (lines 5 and 6),
// then invokes the displayObject method to display the information on these objects (lines 9–10).
//In the displayObject method (lines 14–25), explicit casting is used to cast the object to Circle if the object is an
// instance of Circle, and the methods getArea and getDiameter are used to display the area and diameter of the circle.
//Casting can be done only when the source object is an instance of the target class. The program uses the instanceof
// operator to ensure that the source object is an instance of the target class before performing a casting (line 15).
//Explicit casting to Circle (lines 17 and 19) and to Rectangle (line 23) is necessary because the getArea and
// getDiameter methods are not available in the Object class.
