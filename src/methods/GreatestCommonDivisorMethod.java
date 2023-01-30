package methods; import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2)); // invoke gcd
    }


    // Return the gcd of two integers
    public static int gcd(int n1, int n2) { // compute gcd
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd; // return gcd
    }
}

// This program prompts the user to enter two integers and displays their greatest common divisor.

// By encapsulating the code for obtaining the gcd in a method, this program has several advantages:
//1. It isolates the problem for computing the gcd from the rest of the code in the main method. Thus, the logic becomes clear, and the program is easier to read.
//2. The errors on computing the gcd are confined in the gcd method, which narrows the scope of debugging.
//3. The gcd method now can be reused by other programs.