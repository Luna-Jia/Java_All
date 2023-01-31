package Module3_IfElse;

import java.util.Scanner;

public class Zoom6_switchZodiac {

    public static void main(String[] args){

        int yearBorn;
        Scanner kbInput = new Scanner(System.in);
        System.out.println("please enter the year you were born:");
        yearBorn = kbInput.nextInt();
        switch (yearBorn%12){
            case 4:
                System.out.println("your chinese zodiac is Rat");
                break;
            case 5:
                System.out.println("your chinese zodiac is Ox");
                break;
            case 6:
                System.out.println("your chinese zodiac is Tiger");
                break;
            case 7:
                System.out.println("your chinese zodiac is Rabbit");
                break;
            case 8:
                System.out.println("your chinese zodiac is Dragon");
                break;
            case 9:
                System.out.println("your chinese zodiac is Snake");
                break;
            case 10:
                System.out.println("your chinese zodiac is Horse");
                break;
            case 11:
                System.out.println("your chinese zodiac is Goat");
                break;
            case 0:
                System.out.println("your chinese zodiac is Monkey");
                break;
            case 1:
                System.out.println("your chinese zodiac is Rooster");
                break;
            case 2:
                System.out.println("your chinese zodiac is Dog");
                break;
            case 3:
                System.out.println("your chinese zodiac is Pig");
                break;
            default:
                System.out.println("invalid data");

        }
    }
}
