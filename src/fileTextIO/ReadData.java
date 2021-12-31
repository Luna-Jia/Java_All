package fileTextIO;
import java.util.Scanner;
public class ReadData {
    public static void main(String[] args) throws Exception {
        // Create a File instance // To create a Scanner to read data from a file, you have to use the java.io.File class to create an instance of the File using the constructor new File(filename) (line 6)
        java.io.File file = new java.io.File("scores.txt");

        // Create a Scanner for the file //  and use new Scanner(File) to create a Scanner for the file (line 9).
        Scanner input = new Scanner(file);
// Invoking the constructor new Scanner(File) may throw an I/O exception, so the main method declares throws Exception in line 4.
        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
// Each iteration in the while loop reads the first name, middle initial, last name, and score from the text file (lines 12–19).

        // Close the file (line 22)
        input.close();
    }
}
