package newton_sqrt;

import java.util.Scanner;

public class Newton_sqrt {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in N for Newton: ");
        n = sc.nextInt();
        double newGuess;
        double oldGuess;
        double diff = 1;
        oldGuess = n / 2.0;
        while (diff > 0.00001) {
            newGuess = (n / oldGuess + oldGuess) / 2;
            diff = Math.abs(newGuess - oldGuess);
            oldGuess = newGuess;
        }

        System.out.println("Newton (" + n + ") = "+oldGuess);
        System.out.println("Math.sqrt = "+Math.sqrt(n));
    }
}
