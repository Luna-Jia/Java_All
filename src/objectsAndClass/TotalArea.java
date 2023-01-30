package objectsAndClass;
public class TotalArea {

    public static void main(String[] args) {
        // Declare circleArray
        CircleWithPrivateDataFields[] circleArray; // array of objects

        // Create circleArray
        circleArray = createCircleArray(); // The program invokes createCircleArray() (line 9) to create an array of five circle objects.

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

// Create an array of CircleWithPrivateDataFields objects
    public static CircleWithPrivateDataFields[] createCircleArray() { // class本质上个type，像int, double, void一样
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100); // The circle radii are randomly generated using the Math.random() method (line 20).
        }

        // Return Circle array
        return circleArray; // return array of objects // The createCircleArray method returns an array of CircleWithPrivateDataFields objects (line 24).
    }

    // Print an array of circles and their total area
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) { // pass array of objects // The array is passed to the printCircleArray method, which displays the radius and area of each circle and the total area of the circles.
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
        }

        System.out.println("————————————————————————————");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray)); // The sum of the circle areas is computed by invoking the sum method (line 37), which takes the array of CircleWithPrivateDataFields objects as the argument and returns a double value for the total area.
    }

    // Add circle areas
    public static double sum(CircleWithPrivateDataFields[] circleArray) { // pass array of objects
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }
}

// Listing 9.11 gives an example that demonstrates how to use an array of objects. The pro- gram summarizes the areas of
// an array of circles. The program creates circleArray, an array composed of five Circle objects; it then initializes
// circle radii with random values and displays the total area of the circles in the array.