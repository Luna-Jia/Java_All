package sort.insertionSort;

import java.util.Arrays;

public class InsertionSortDemo {
    private static void insertionSort(int[] numbers) {
        //The index variable i denotes the starting position of the current
        // element in the unsorted part. Initially, the first element
        // (i.e., element at index 0) is assumed to be sorted, so the outer
        // for loop initializes i to 1.
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                // Swap numbers[j] and numbers [j - 1]
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of numbers to sort
        int[] numbers = { 10, 2, 78, 4, 45, 32, 7, 11 };

        // Display the contents of the array
        System.out.println("UNSORTED: " + Arrays.toString(numbers));

        // Call the sort.selectionSort.insertionSort method
        insertionSort(numbers);

        // Display the sorted contents of the array
        System.out.println("SORTED: " + Arrays.toString(numbers));
    }
}