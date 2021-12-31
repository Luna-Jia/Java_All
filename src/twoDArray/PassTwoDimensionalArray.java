package twoDArray;
import java.util.Scanner;
public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray(); // Get an array

        // Display sum of elements
        System.out.println("\nSum of all elements is " + sum(m)); // pass array
    }

    public static int[][] getArray() { // The method getArray prompts the user to enter values for the array (lines 11–24)
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

            return m; // and returns the array (line 23).
    }

    public static int sum(int[][] m) { // The method sum (lines 26–35) has a two-dimensional array argument.
        int total = 0;
        for (int row = 0; row < m.length; row++) { // You can obtain the number of rows using m.length (line 28),
            for (int column = 0; column < m[row].length; column++) { // and the number of columns in a specified row using m[row].length (line 29).
                total += m[row][column];
            }
        }

        return total;
    }
}

// This is an example with two methods. The first method, getArray(), returns a two-dimensional array and the second
// method, sum(int[][] m), returns the sum of all the elements in a matrix.