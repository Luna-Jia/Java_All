package methods;
public class TestMethodOverloading {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
       // When calling max(3, 4) (line 6), the max method for finding the maximum of two integers is invoked.
        System.out.println("The maximum of 3 and 4 is " + max(3,4));

        // Invoke the max method with the double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
// When calling max(3.0, 5.4) (line 9), the max method for finding the maxi- mum of two doubles is invoked.

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    } // When calling max(3.0, 5.4, 10.14) (line 13), the max method for finding the maximum of three double values is invoked.


    // Return the max of two int values
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    // Find the max of two double values
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    // Return the max of three double values
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2),num3);
    }
}


// Listing 6.9 is a program that creates three methods. The first finds the maximum integer, the second finds the
// maximum double, and the third finds the maximum among three double values. All three methods are named max.

// Methods that perform the same function with different types of parameters should be given the same name.

// Overloaded methods must have different parameter lists. You cannot overload methods based on different modifiers or return types.