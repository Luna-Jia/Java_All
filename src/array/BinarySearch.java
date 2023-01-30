package array; public class BinarySearch {
    // Use binary search to find the key in the list
    public static int binarySearch(int[] list, int key) { // 4. The arguments are passed to invoke the method. list references the array created in the main method.
        int low = 0; // 5. The statement declares low initialized to 0.
        int high = list.length - 1; // 6. The statement declares high initialized to 5.

        while (high >= low) { // 7. The condition (high >= low) is tested. It is true in this case.
            int mid = (low + high) / 2; // 8. The statement obtains mid.
            if (key < list[mid]) // 9. The condition (key<list[mid]) is tested. It is false in this case.
                high = mid - 1;
            else if (key == list[mid]) // 10. The condition(key == list[mid] is tested. It is true in this case. )
                return mid; // 11. The index 2 for the matching element is returned.
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }

    public static void main(String[] args) { // 1. The program starts the execution from the main method.
        int[] list = {-3, 1, 2, 4, 9, 23}; // 2. The statement creates an array with six values.
        System.out.println(binarySearch(list, 2)); // 3. The binarySearch method is invoked. // The statement displays the return value from the binarySearch method.
    } // The main method exits. The program is finished.
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/BinarySearch.html

// When the key is not found, low is the insertion point where a key would be inserted to maintain the order of the list.
// It is more useful to return the insertion point than −1. The method must return a negative value to indicate that the
// key is not in the list. Can it simply return −low? No. If the key is less than list[0], low would be 0. −0 is 0. This
// would indicate the key matches list[0]. A good choice is to let the method return −low − 1 if the key is not in the
// list. Returning −low − 1 indicates not only that the key is not in the list, but also where the key would be inserted.