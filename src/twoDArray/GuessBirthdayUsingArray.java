package twoDArray;
import java.util.Scanner;
public class GuessBirthdayUsingArray {
    public static void main(String[] args) {
        int day = 0; // Day to be determined
        int answer;

        int[][][] dates = { // A three-dimensional array dates is created in lines 8–14. This array stores five sets of numbers. Each set is a 4-by-4 two-dimensional array.
                {{1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}},
                {{2, 3, 6, 7}, {10, 11, 14, 15}, {18, 19, 22, 23}, {26, 27, 30, 31}},
                {{4, 5, 6, 7}, {12, 13, 14, 15}, {20, 21, 22, 23}, {28, 29, 30, 31}},
                {{8, 9, 10, 11}, {12, 13, 14, 15}, {24, 25, 26, 27}, {28, 29, 30, 31}},
                {{16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27}, {28, 29, 30, 31}}
        };

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) { // The loop starting from line 19 displays the numbers in each set // 5行
            System.out.println("Is your birthday in Set" + (i + 1) + "?");
            for (int j = 0; j < 4; j++) { // 每行4大列
                for (int k = 0; k < 4; k++) { // 每列还有4个item
                    System.out.printf("%4d", dates[i][j][k]); // 每个item占4个字符
                }
                System.out.println(); // 每行都另起一行
            }

            System.out.print("\nEnter 0 for No and 1 for Yes: "); // and prompts the user to answer whether the birthday is in the set (lines 28 and 29).
            answer = input.nextInt();

            if (answer == 1)
                day += dates[i][0][0]; // If the day is in the set(line 30), the first number (dates[i][0][0]) in the set is added to variable day (line 32).
        }

        System.out.println("Your birthday is " + day);
    }
}

// https://www.youtube.com/watch?v=DRPhqBY_PG8

// 8.8.2 Case Study: Guessing Birthdays
//Listing 4.3, GuessBirthday.java, gives a program that guesses a birthday. The program can be simplified by storing the
// numbers in five sets in a three-dimensional array and it prompts the user for the answers using a loop, as given in
// Listing 8.6. The sample run of the program can be the same as given in Listing 4.3.