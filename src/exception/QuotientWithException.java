package exception;
import java.util.Scanner;
public class QuotientWithException {
    public static int quotient(int number1, int number2){ // quotient method
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero"); // throw exception

        return number1 / number2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt(); // read two integers
        int number2 = input.nextInt();

        try { // try block // The statement for invoking the method is contained in a try block. The try block (lines 19–23) contains the code that is executed in normal circumstances
            int result = quotient(number1, number2); // invoke method
            System.out.println(number1 + " / " + number2 + " is " + result);
        }
// The exception is caught by the catch block. The code in the catch block is executed to handle the exception.
        catch (ArithmeticException ex) { //If an arithmeticException occurs // The identifier ex in the catch–block header acts very much like a parameter in a method. Thus, this parameter is referred to as a catch– block parameter. The type (e.g., ArithmeticException) preceding ex specifies what kind of exception the catch block can catch. Once the exception is caught, you can access the thrown value from this parameter in the body of a catch block.
            System.out.println("Exception: an integer " + "cannot be divided by zero ");
        }

// Afterward, the statement (line 29) after the catch block is executed.
        System.out.println("Execution continues ...");
    }
}

// The key benefit of exception handling is separating the detection of an error (done in a called method) from the handling of an error (done in the calling method).