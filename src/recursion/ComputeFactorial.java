package recursion;
import java.util.Scanner;
public class ComputeFactorial {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    // Return the factorial for the specified number
    public static long factorial(int n) {
        if (n==0) // Base case, 必须有，否则无限recursion，overflow
            return 1;
        else
            return n * factorial(n-1); // Recursive call
    }
}

// The program prompt the user to enter a non-negative integer and
// displays the factorial for the number.
