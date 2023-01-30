package methods;
public class TestPassByValue {
    // Main method
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2); // Before the swap method is invoked (line 12), num1 is 1 and num2 is 2.

        // Invoke the swap method to attempt to swap two variables
        swap(num1, num2); // As shown in Figure 6.4, the values of the arguments num1 and num2 are passed to n1 and n2, but n1 and n2 have their own memory locations independent of num1 and num2. Therefore, changes in n1 and n2 do not affect the contents of num1 and num2.

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2); // After the swap method is invoked, num1 is still 1 and num2 is still 2.Their values have not been swapped.
    }


    // Swap two variables
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);


        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}

// Listing 6.5 gives another program that demonstrates the effect of passing by value. The pro- gram creates a method
// for swapping two variables. The swap method is invoked by passing two arguments. Interestingly, the values of the
// arguments are not changed after the method is invoked.
