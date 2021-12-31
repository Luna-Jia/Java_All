package loop; import java.util.Scanner;

public class GreatestCommonDivisor {
    // Main method
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt(); // input // Let the two input integers be n1 and n2.
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt(); // input
// You know that number 1 is a common divisor, but it may not be the greatest common divisor.
        int gcd = 1; // Initial gcd is 1 //  Store the common divisor in a variable named gcd. Initially, gcd is 1.
        int k = 2;
        while (k <= n1 && k <= n2) { // Therefore, you can check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
            if (n1 % k == 0 && n2 % k == 0) // check divisor
                gcd = k; // Update gcd // Whenever a new common divisor is found, it becomes the new gcd.
            k++;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}

//Listing 5.9 presents the program that prompts the user to enter two positive integers and finds their greatest common
// divisor. 寻找最大公分母。（The greatest common divisor (gcd) of the two integers 4 and 2 is 2. The greatest common
// divisor of the two integers 16 and 24 is 8）
