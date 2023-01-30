package Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // The program creates an ArrayList for Integer objects (line 9)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do { // and repeatedly reads a value in the loop (lines 15–19).
            value = input.nextInt(); // Read a value from the input
            if (!list.contains(value) && value != 0)
                list.add(value); // Add the value if it is not in the list
        } while (value != 0);

        // Display the distinct numbers
        System.out.print("The distinct integers are: ");

        for (Integer number: list) // traverse each element in arraylist with foreach loop
            System.out.print(number + " ");

        // for (int number: list) // Note the elements in list are Integer objects. They are automatically unboxed into int in this foreach loop.
        // System.out.print(number + " ");

        // for (int i = 0; i < list.size(); i++)
          //  System.out.print(list.get(i) + " ");

    }
}
