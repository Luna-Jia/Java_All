package array;
public class LinearSearch {
    // The method for finding a key in the list
    public static int linearSearch(int[] list, int key) { // 4. The arguments are passed to invoke the method. list references the array created in the main method.
        for (int i = 0; i< list.length; i++) { // The for loop initializer initializes i to 0. // The condition i < list.length is tested. Since i is 0 and list.length is 6, it is true in this case.
            if (key == list[i]) // The statement tests if key == list[i], it is false when i==0 // Then i is incremented by 1. Repeat.
                return i; // The method returns 3, which is the index of the matching element for the key.
        }
        return -1;
    }

    public static void main(String[] args) { // 1. The program starts the execution from the main method.
        int[] list = {4, 5, 1, 2, 9, -3}; // 2. The statement creates an array with six values.
        System.out.println(linearSearch(list, 2)); // 3. The linearSearch method is invoked. // The statement displays the return value from the linearSearch method.
    } // The main method exits. The program is finished.
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/LinearSearch.html

// The linear search approach compares the key element key sequentially with each element in the array. It continues to
// do so until the key matches an element in the array, or the array is exhausted without a match being found. If a
// match is made, the linear search returns the index of the element in the array that matches the key. If no match is
// found, the search returns −1.

// The linear search method compares the key with each element in the array. The elements can be in any order. On
// average, the algorithm will have to examine half of the elements in an array before finding the key, if it exists.
// Since the execution time of a linear search increases linearly as the number of array elements increases, linear
// search is inefficient for a large array.