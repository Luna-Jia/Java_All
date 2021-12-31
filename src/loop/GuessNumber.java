package loop; import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101); // The program generates the magic number in line 6

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1; // while loop 外的初始量 // Note that guess is initialized to -1. Initializing it to a value between 0 and 100 would be wrong, because that could be the number to be guessed.
        while (guess != number) { // prompt the user to enter a guess continuously in a while loop(line 12-23) // When the guess is correct, the program exits the loop(line 12).
            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt(); // enter a guess

            if (guess == number) // For each guess, the program checks whether the guess is correct, too high, or too low(lines 17-22).
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("You guess is too low");
        } // End of loop
    }
}

//This case study generates a random number and lets the user repeatedly guess a number until it is correct.
// The problem is to guess what number a computer has in mind. You will write a program that randomly generates an
// integer between 0 and 100, inclusive. The program prompts the user to enter a number continuously until the number
// matches the randomly generated number. For each user input, the program tells the user whether the input is too low
// or too high, so the user can make the next guess intelligently.
