package Zoom4_89Loops;

import java.util.Scanner;

public class while1A {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        int number = 0;
        while (number >=0) {
            System.out.println("enter a number:");
            number = kbInput.nextInt();
            System.out.println("You just entered: " + number);
        }
        System.out.println("We are done.");
    }
}
