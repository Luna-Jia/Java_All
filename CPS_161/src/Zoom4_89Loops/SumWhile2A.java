package Zoom4_89Loops;

import java.util.Scanner;

public class SumWhile2A {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0; // ================

        System.out.println("enter a number:");
        number = kbInput.nextInt();
        while (number >=0) {
            System.out.println("You just entered: " + number);
            count++;
            sum = sum + number; // or sum += number;====================
            System.out.println("enter a number:");
            number = kbInput.nextInt();
        }
        System.out.println("You entered " + count + "positive numbers");
        System.out.println("The total is: " + sum);
        System.out.println("We are done.");
    }
}
