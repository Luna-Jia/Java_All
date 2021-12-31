package objectsAndClass;
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + Circle.numberOfObjects); // Line 5 displays the number of objects, which is 0, since no objects have been created.


        // Create c1 object
        Circle c1 = new Circle(); //  The main method creates two circles c1 and c2 (lines 9 and18).
// The static variable numberOfObjects becomes 1 after c1 is created (line 9), and it becomes 2 after c2 is created (line 18).
        // Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");



        // Create c2
        Circle c2 = new Circle(5);

        // Modify c1
        c1.radius = 9; // The instance variable radius in c1 is modified to become 9 (line 21).

        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");


        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}

// c1.number- OfObjects (line 25) and c2.numberOfObjects (line 28) are better replaced by Circle. numberOfObjects. This
// improves readability because other programmers can easily recognize the static variable. You can also replace
// Circle.numberOfObjects with Circle. getNumberOfObjects().
