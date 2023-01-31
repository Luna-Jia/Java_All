package Module3_IfElse;

import java.util.Scanner;

public class Zoom5_IfAbosluteValue {

    public static void main(String[] args){

        Scanner kbInput = new Scanner (System.in);
        int number;
        int absNumber;

        System.out.println("please enter a number:");
        number = kbInput.nextInt(); // initialize variable number.
        absNumber = number; // then you can assign it to another value absNumber.

        if (number <0) {
            absNumber=number *(-1);
        }
        System.out.println("the absolute value is:"+ number);

    }
}
