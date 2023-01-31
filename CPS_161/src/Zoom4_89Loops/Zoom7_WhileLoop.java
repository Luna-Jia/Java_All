package Zoom4_89Loops;

import java.util.Scanner;

public class Zoom7_WhileLoop {

    public static void main(String[] args) {

        int userInput;

        int number = 20;

        while (number > 10) {
            System.out.println(number + "is greater than 10");
            number--;
        }

        Scanner kbInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        while (kbInput.nextInt() > 0) {
            System.out.print("Enter a number: ");

        }

    }

}

// three part:
// Part one: ask the right question
// part two: when the first question's answer is yes, what do you what to?
// part three: update the condition