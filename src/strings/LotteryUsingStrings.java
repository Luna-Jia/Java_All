package strings;
import java.util.Scanner;
public class LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10); // The program generates two random digits and concatenates them into the string lottery (lines 6). After this, lottery contains two random digits.


        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine(); // The program prompts the user to enter a guess as a two-digit string (line 12) and checks the guess against the lottery number in this order:

        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) // First, check whether the guess matches the lottery exactly (line 25).
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) //  If not, check whether the reversal of the guess matches the lottery (line 27).
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) // If not, check whether one digit is in the lottery (lines 29).
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match"); // If not, nothing matches and display “Sorry, no match” (line 32).
    }

    // The lottery program generates a random two-digit string instead of a number, and receives the user input as a
    // string instead of a number, prompts the user to enter a two-digit string, and determines whether the user wins
    // according to the following rule:
    //1. If the user input matches the lottery number in the exact order, the award is $10,000.
    //2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.
    //3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.

}
