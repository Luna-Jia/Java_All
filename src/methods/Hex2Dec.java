package methods; import java.util.Scanner;

public class Hex2Dec {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println(5 * Math.pow(16,2));
        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine(); // The program reads a string from the console (line 11)

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    } // and invokes the hexToDecimal method to convert a hex string to decimal number (line 14).
// The characters can be in either lowercase or uppercase. They are converted to uppercase before invoking the hexToDecimal method.
// The hexToDecimal method is defined in lines 17–25 to return an integer.
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) { // The length of the string is determined by invoking hex.length() in line 19.
            char hexChar = hex.charAt(i); double a = 5 * Math.pow(16,2) ;
            //decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            decimalValue += hexCharToDecimal(hexChar)*Math.pow(16,i);

        }

        return decimalValue;
    }
// The hexCharToDecimal method is defined in lines 27–32 to return a decimal value for a hex character. The character can be in either lowercase or uppercase.
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0'; // Recall that to subtract two characters is to subtract their Unicodes. For example, '5' – '0' is 5.
    }
}
