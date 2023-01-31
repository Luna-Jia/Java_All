package Module3_IfElse;

import java.util.Scanner;

public class Zoom6_switchGrade {
    public static void main (String[] args){
        char grade;
        Scanner kbInput = new Scanner(System.in);

        System.out.println("please enter your grade:");
        grade = kbInput.nextLine().toUpperCase().charAt(0);
        switch (grade){ // switch variable can only be integer, char, or string
            case 'A':
                System.out.println("excellent");
                break;
            case'B':
            case'C':
                System.out.println("well done");
                break;
            case'D':
                System.out.println("you passed");
                break;
            case 'F':
                System.out.println("better try again");
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
