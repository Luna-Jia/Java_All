package loop; import java.util.Scanner;
// This code only let user guess once
public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt(); // enter a guess

        if (guess == number) // correct guess
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("You guess is too high"); // too high
        else
        System.out.println("You guess is too low"); // too low
    }
}
