package sort.selectionSort;
import java.util.Arrays;

public class SelectionSortDemo {
    //The sort.selectionSort() method takes the array as a parameter,
    // and has no return value since the array is sorted in-place by the algorithm.
    private static void selectionSort(int[] numbers) {

        //In outer loop, variable i holds the index position that will be sorted next in the array.
        for (int i = 0; i < numbers.length - 1; i++) {
            // Find index of smallest remaining element
            int indexSmallest = i;

            //In inner loop, variable j examines all indices from i+1 to the end of the array.
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexSmallest]) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            //The variable temp is used to copy the value from numbers[i] to
            // numbers[indexSmallest] and vice-versa.
            int temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }

    public static void main(String[] args) {
        // Create an array of numbers to sort
        int[] numbers = { 10, 2, 78, 4, 45, 32, 7, 11 };

        // Display the contents of the array
        System.out.println("UNSORTED: " + Arrays.toString(numbers));

        // Call the sort.selectionSort method
        selectionSort(numbers);

        // Display the sorted contents of the array
        System.out.println("SORTED: " + Arrays.toString(numbers));
    }
}