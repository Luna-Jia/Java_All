package loop; import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions // The program uses the control variable count to control the execution of the loop. count is initially 0 (line 7) and is increased by 1 in each iteration(line 39).
        long startTime = System.currentTimeMillis(); // get start time // The program obtains the time before the test starts in line 8 and the time after the test ends in line 45,
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) { // loop
            // 1.Generate two random single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1; // 把number1放到temp的篮子里，number1的篮子现在空了，temp的篮子装着number1
                number1 = number2; // 把number2放到number1的篮子里，现在number2的篮子空了，number1的篮子装着number2
                number2 = temp; // 把temp（即number1）装到number2的篮子里，现在number2的篮子里装着number1，temp空了，swap完成
            }

            // 3. Prompt the student to answer "What is number1 - number2?"
            System.out.print("What is " + number1 + " - " + number2 + "? "); // display a question

            int answer = input.nextInt();

            // 4.Grade the answer and display the result
            if (number1 - number2 == answer) { // grade an answer
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));


            // Increase the question count
            count++; //increase control variable // count is increased by 1 in each iteration.

            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct": " wrong"); // prepare output
        } // end loop


        long endTime = System.currentTimeMillis(); // get end time // The program obtains the time after the test ends in line 45,
        long testTime = endTime - startTime; // test time // then computes the test time in line 46

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " second\n" + output); // display result
    } // The test time is in milliseconds 毫秒 and is converted to seconds in line 48.
}

// Listing 5.4 gives a program that generates five questions and, after a student answers all five, reports the number
// of correct answers. The program also displays the time spent on the test and lists all the questions.
