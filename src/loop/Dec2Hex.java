package loop; import java.util.Scanner;

public class Dec2Hex {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt(); // input decimal // The program prompts the user to enter a decimal integer(line 11),

        // Convert decimal to hex // converts it to a hex number as a string (lines 14–25),
        String hex = ""; // decimal to hex // The hex string is initially empty (line 14).

        while (decimal != 0) { // The loop ends when the remaining decimal number becomes 0.
            int hexValue = decimal % 16; // To convert a decimal to a hex number, the program uses a loop to successively divide the decimal number by 16 and obtain its remainder (line 17).

            // Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9)? // get a hex char // The remainder is converted into a hex character (lines 20 and 21).
                    (char)(hexValue + '0'): (char)(hexValue - 10 + 'A'); // The program converts a hexValue between 0 and 15 into a hex character. If hexValue is between 0 and 9, it is converted to (char)(hexValue +'0') (line 21).
// Recall that when adding a character with an integer, the character’s Unicode is used in the evaluation. For example, if hexValue is 5, (char)(hexValue + '0') returns 5. Similarly, if hexValue is between 10 and 15, it is converted to (char)(hexValue – 10 + 'A') (line 21). For instance, if hexValue is 11, (char),(hexValue – 10 + 'A') returns B.
            hex = hexDigit + hex; // add to hex string // The character is then appended to the hex string (line 23).
            decimal = decimal / 16; //  Divide the decimal number by 16 to remove a hex digit from the number (line 24).
        }

        System.out.println("The hex number is " + hex); //  and displays the result (line 27).
    }
}
