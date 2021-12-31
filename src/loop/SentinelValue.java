package loop; import java.util.Scanner;

public class SentinelValue {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");

        int data = input.nextInt(); // input

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) { // loop // Note if the first input read is 0, the loop body never executes, and the resulting sum is 0.
            sum += data; // if data is not 0,it is added to sum(line 17)

            // Read the next data //and the next item of input data is read (line 20-22)
            System.out.print("Enter an integer (the input ends if it is 0): ");

            data = input.nextInt(); // The input value 0 is the sentinel value for this loop.
        } // end of loop
// if data is 0, the loop body is no longer executed and the while loop terminates.
        System.out.println("The sum is " + sum); // display result
    }
}
