package array;
public class TestPassArray {
    public static void main(String[] args) { // 1. The program starts the execution from the main method.
        int[] a = {1, 2}; // 2. The statement creates an array with two elements.

        // Swap elements using the swap method. // 3. (line 7-8) The statements display the array values before invoking the first swap method.
        System.out.println("Before invoking swap");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]); // false swap. // 4. The statement invokes swap(a[0], a[1]).
        System.out.println("After invoking swap"); // 10. (line 10-11) The statements display the values of the array after invoking the swap method.
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        // Swap elements using the swapFirstTwoInArray method
        System.out.println("Before invoking swapFirstTwoInArray"); // 11. (line 14-15) The statements display the values of the array after invoking the swap method.
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a); // 12. The statement invokes swapFirstTwoInArray(a).
        System.out.println("After invoking swapFirstTwoInArray"); // 18. (line 17-18) The statements display the values of the array after invoking the swapFirstTwoInArray method.
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    } // 19. The main method exits. The program is finished.

    // Swap two variables
    public static void swap(int n1, int n2) { // 5. The value of a[0] is passed to n1, and the value of a[1] to n2.
        int temp = n1; // 6. The value of n1 is assigned to temp.
        n1 = n2; // 7. The value of n2 is assigned to n1.
        n2 = temp; // 8. The value of temp is assigned to n2.
    } // 9. The method is finished, and will be returned to the main method.

    // Swap the first two elements in the array
    public static void swapFirstTwoInArray(int[] array) { // 13. The value of a is the reference to the array. It is passed to array. Now array and a reference the same array.
        int temp = array[0]; // 14. array[0] is assigned to temp.
        array[0] = array[1]; // 15. array[1] is assigned to array[0].
        array[1] = temp; // 16. temp is assigned to array[1].
    } // 17. The method is finished and will be returned to the main method.
}

// As shown in Figure 7.6, the two elements are not swapped using the swap method. However, they are swapped using the
// swapFirstTwoInArray method. Since the parameters in the swap method are primitive type, the values of a[0] and a[1]
// are passed to n1 and n2 inside the method when invoking swap(a[0], a[1]). The memory locations for n1 and n2 are
// independent of the ones for a[0] and a[1]. The contents of the array are not affected by this call.

// The parameter in the swapFirstTwoInArray method is an array. As shown in Figure 7.6, the reference of the array is
// passed to the method. Thus, the variables a (outside the method) and array (inside the method) both refer to the same
// array in the same memory location. Therefore, swapping array[0] with array[1] inside the method swapFirstTwoInArray
// is the same as swapping a[0] with a[1] outside of the method.

// https://liveexample.pearsoncmg.com/liang/intro12e/html/TestPassArray.html