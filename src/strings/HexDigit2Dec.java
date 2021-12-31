package strings;
import java.util.Scanner;
public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine(); // The program reads a string from the console (line 7)

        // Check if the hex string has exactly one character
        if (hexString.length() != 1) { // and checks if the string contains a single character (line 10).
            System.out.println("You must enter exactly one character");
            System.exit(1); // If not, report an error and exit the program (line 12).
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0)); // The program invokes the Character.toUpperCase method to obtain the character ch as an uppercase letter (line 16).
        if ('A' <= ch && ch <='F') { // If ch is between 'A' and 'F' (line 17),
            int value = ch -'A' + 10; // the corresponding decimal value is ch – 'A' + 10 (line 18). Note ch – 'A' is 0 if ch is 'A', ch – 'A' is 1 if ch is 'B', and so on. When two characters perform a numerical operation, the characters' Unicodes are used in the computation.
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }

        else if (Character.isDigit(ch)) { // The program invokes the Character.isDigit(ch) method to check if ch is between '0' and '9' (line 22).
            System.out.println("The decimal value for hex digit " + ch + " is " + ch); // If so, the corresponding decimal digit is the same as ch (lines 23 and 24).
        }

        else {
            System.out.println(ch + " is an invalid input"); // If ch is not between 'A' and 'F' nor a digit character, the program displays an error mes- sage (line 27).
        }
    }
}
