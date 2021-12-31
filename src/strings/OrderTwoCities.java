package strings;
import java.util.Scanner;
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 =input.nextLine(); // The program reads two strings for two cities (lines 9 and 11).
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine(); // If input.nextLine() placed by input.next() (line 11), you cannot enter a string with spaces for city2.
// Since a city name may contain multiple words separated by spaces, the program uses the nextLine method to read a string (lines 9 and 11).
        if (city1.compareTo(city2) < 0) // Invoking city1.compareTo(city2) compares two strings city1 with city2 (line 13). A negative return value indicates that city1 is less than city2.
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
}

//  This is a program that prompts the user to enter two cities and displays them in alphabetical order.
