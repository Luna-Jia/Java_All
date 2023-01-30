package array;

import java.util.Scanner;

public class ConsecutiveFour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        if (isConsecutiveFour(values))
            System.out.println("The series has consecutive fours");
        else
            System.out.println("The series has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            boolean isEqual = true;
            for (int j=i; j < i + 3; j ++) {
                if (values[j] != values[j+1]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual)
                return true;
        }
        return false; // If we go through all the outer loop, and don't find consecutive, return false.
    }
}

// *7.30 (Pattern recognition: consecutive four equal numbers) Write the following method that tests whether the array
// has four consecutive numbers with the same value: public static boolean isConsecutiveFour(int[] values)

//Write a test program that prompts the user to enter a series of integers and dis- plays it if the series contains four
// consecutive numbers with the same value. Your program should first prompt the user to enter the input size—i.e.,
// the number of values in the series.

// https://mediaplayer.pearsoncmg.com/assets/secs-liang-Consecutive_Four