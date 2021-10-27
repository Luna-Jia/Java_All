package exception;
import java.util.Scanner;
public class QuotientWithMethod {
    public static int quotient(int number1, int number2) { //quotient method
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1); // terminate the program
            //This is clearly a problem. You should not let the method
            // terminate the program. The caller should decide whether to termi-
            // nate the program.
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }
}
