package loop; import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10); // generate number1
        int number2 = (int) (Math.random() * 10); // generate number2

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? "); // show question

        int answer = input.nextInt(); // get first answer

        while (answer != number1 + number2) { // check answer
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");

            answer = input.nextInt(); // read an answer
        }

        System.out.println("You got it!");
    }

}
