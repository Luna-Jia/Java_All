package exception;
import java.util.*;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true; // initial value is true

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt(); // When executing input.nextInt() (line 11), an InputMismatchException occurs if the input entered is not an integer.

                // Display the result
                System.out.println("The number entered is " + number);

                //Once a valid input is received, there is no need to continue the input.
                continueInput = false; // changed to false when a valid input is received.
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");

                input.nextLine(); // Discard input
                //discards the current input line so the user can enter a new line of input.
            }
        } while (continueInput); // The variable continueInput controls the loop.
    }
}
