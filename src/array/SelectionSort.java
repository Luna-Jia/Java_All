package array;

public class SelectionSort {
    // The method for sorting the numbers // 4. (line 5) The argument is passed to invoke the method. list references the array created in the main method.
    public static void selectionSort(double[] list) { // The selectionSort(double[] list) method sorts any array of double elements.
        for (int i = 0; i < list.length - 1; i++) { // The outer loop (with the loop control variable i in line 6) is iterated in order to find the smallest element in the list, which ranges from list[i] to list[list.length−1], and exchanges it with list[i]. The variable i is initially 0.
            // Find the minimum in the list[i ~ list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
// The method is implemented with a nested for loop.
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list [currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        } // After each iteration of the outer loop, list[i] is in the right place. Eventually, all the elements are put in the right place; therefore, the whole list is sorted.
    }

    public static void main(String[] args) { // 1. The program starts the execution from the main method.
        double[] list = {-2, 4.5, 5, 1, 2, -3.3}; // 2. The statement creates an array with six values.
        selectionSort(list); // 3. The selectionSort method is invoked.
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}


// https://mediaplayer.pearsoncmg.com/assets/secs-liang-Selection_Sort

