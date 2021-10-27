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

        try { // try block
            int result = quotient(number1, number2); // invoke method
            System.out.println(number1 + " / " + number2 + " is " + result);
        }

        catch (ArithmeticException ex) { //If an arithmeticException occurs
            System.out.println("Exception: an integer " + "cannot be divided by zero ");
        }


        System.out.println("Execution continues ...");
    }
}
