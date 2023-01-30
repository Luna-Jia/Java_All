package classAbstraction_Encapsulation;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE; // constant 1 // BigInteger.ONE (line 13) is a constant defined in the BigInteger class. BigInteger. ONE is the same as new BigInteger("1").
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + "")); // A new result is obtained by invoking the multiply method (line 17).

        return result;
    }
}

// Note the factorial of an integer can be very large. Listing 10.9 gives a method that can return the factorial of any integer.