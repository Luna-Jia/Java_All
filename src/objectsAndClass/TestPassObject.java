package objectsAndClass;
public class TestPassObject {
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);


        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n); // The program passes a CircleWithPrivateDataFields object myCircle and an integer value from n to invoke printAreas(myCircle, n) (line 10), which prints a table of areas for radii 1, 2, 3, 4, and 5, as presented in the sample output.

        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    // Print a table of areas for radius
    public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea"); // \t means tab, escape white space character
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
