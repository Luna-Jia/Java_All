package sort.quickSort;
public class QuickSort {
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1); //sort method
    }
    public static void quickSort(int[] list, int first, int last) { //helper method
        if (last > first) { // recursive call
            int pivotIndex = partition(list, first, last); //全部list
            quickSort(list, first, pivotIndex-1); // list 前部分
            quickSort(list, pivotIndex + 1, last); //list 后部分
        }
    }

    //Partition the array list[first~last]
    public static int partition(int[] list, int first, int last) {
        int pivot = list[first]; //choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left in the array for the first element that is greater than the pivot
            while (low <= high && list[low] <= pivot) //forward,从左往右找第一个比pivot大的数，若没找到，就一直往右，low++
                low++;

            // Search backward from right for the first element in the array that is less than or equal to the pivot
            while (low <= high && list[high] > pivot)
                high--; // backward， 从最后往前找第一个比pivot小的数，若没找到，就一直往前移, high--

            // Swap two elements in the list, 如果找到了上边的任意一种情况，就交换swap
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        //Swap pivot with list[high]
        if (pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high; // The method returns the new index for the pivot that divides the subarrays into two parts if the pivot has been moved
        }
        else {
            return first; // Otherwise, it returns the original index for the pivot
        }
    }

    // A test method
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        quickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

// From Daniel Liang textbook: Intro to Java
