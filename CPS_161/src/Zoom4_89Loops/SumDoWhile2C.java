package Zoom4_89Loops;

import java.util.Scanner;

public class SumDoWhile2C {
    public static void main(String[] args){
        Scanner kbInput = new Scanner(System.in);
        int number;
        int count =0 ;
        int sum = 0 ;

        do {
            System.out.println("enter a number:");
            number = kbInput.nextInt();
            System.out.println("You just entered: " + number);
            if (number < 0) {               //=========================
                break;                      //=========================
            }
                count++;
                sum += number;


        } while (number >=0);
        System.out.println("You entered " + count + "positive numbers");
        System.out.println("The total is: " + sum);
        System.out.println("We are done.");
    }
}
