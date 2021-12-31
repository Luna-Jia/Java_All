package loop;
public class MultiplicationTable {
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("          Multiplication Table"); // The program displays a title(line 5) on the first line in the output.

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++) // The first for loop (lines 9 and 10) displays the numbers 1-9 on the second line.
            System.out.print("   " + j);

        System.out.println("\n-------------------------------------------"); // A dashed(-) line is displayed on the third line(line 12).

        // Display table body
        for (int i = 1; i <= 9; i++) { // outer loop // The next loop (line 15-22) is a nested for loop with the control variable i in the outer loop
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) { // inner loop // and j in the inner loop.
                // Display the product and align properly
                System.out.printf("%4d", i * j); // For each i, the product i*j is displayed on a line in the inner loop, with j being 1,2,3,...,9.
            }
            System.out.println();
        }
    }
}
