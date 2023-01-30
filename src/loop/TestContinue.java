package loop;
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}

// You can also use the continue keyword in a loop. When it is encountered, it ends the current iteration and program
// control goes to the end of the loop body. In other words, continue breaks out of an iteration, while the break
// keyword breaks out of a loop. Listing 5.13 presents a program to demonstrate the effect of using continue in a loop.

// The program in Listing 5.13 adds integers from 1 to 20 except 10 and 11 to sum. With the if statement in the program
// (line 9), the continue statement is executed when number becomes 10 or 11. The continue statement ends the current
// iteration so that the rest of the statement in the loop body is not executed; therefore, number is not added to sum
// when it is 10 or 11.