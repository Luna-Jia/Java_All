package search;

import java.util.Scanner;

public class BinarySearchDemo {
    private static int binarySearch(int[] numbers, int key) {
        // Variables to hold the low, middle and high indices
        // of the area being searched. Starts with entire range.

        int low = 0;
        int high = numbers.length - 1;
        int mid = 0;

        // Loop until "low passes "high"
        while (high >= low) {
            // Calculate the middle index
            mid = (high + low) / 2;

            // Cut the range to either the left or right half, unless numbers[mid] is the key
            if (key > numbers[mid]) {
                low = mid + 1;
            }
            else if (numbers[mid] > key) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1; // not found
    }

    // Main program to test the binarySearch() method
    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
        System.out.print("NUMBERS: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int key = scanner.nextInt();
        int keyIndex = binarySearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        }
        else {
            System.out.printf("Found %d at index %d.\n", key, keyIndex);
        }
    }
}
