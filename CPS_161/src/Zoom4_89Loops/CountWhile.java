package Zoom4_89Loops;

import java.util.Scanner;

public class CountWhile {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        int number;
        int count = 0;

        System.out.println("enter a number:");
        number = kbInput.nextInt();
        while (number >=0) {
            System.out.println("You just entered: " + number);
            count++;
            System.out.println("enter a number:");
            number = kbInput.nextInt();
        }
        System.out.println("You entered " + count + "positive numbers");
        System.out.println("We are done.");
    }
}
