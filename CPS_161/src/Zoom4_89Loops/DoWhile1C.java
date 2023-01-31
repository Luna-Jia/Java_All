package Zoom4_89Loops;

import java.util.Scanner;

public class DoWhile1C {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number:");
            number = kbInput.nextInt();
            System.out.println("You just entered: " + number);
        } while (number >= 0);
        System.out.println("We are done.");
    }
}
