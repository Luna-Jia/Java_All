package loop;
public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) // Without the if statement (line 10),the program calculates the sum of the numbers from 1 to 20. However, with the if statement, the loop terminates when sum becomes greater than or equal to 100.
                break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}

// The program in Listing 5.12 adds integers from 1 to 20 in this order to sum until sum is greater than or equal to 100.