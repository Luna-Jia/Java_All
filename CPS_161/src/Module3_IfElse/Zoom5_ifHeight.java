package Module3_IfElse;

import java.util.Scanner;

public class Zoom5_ifHeight {

    public static void main(String[] orgs) {

        Scanner kbInput = new Scanner(System.in);
        int height;
        System.out.println("Please enter your height:");
        height = kbInput.nextInt();

        if (height >= 50){
            System.out.println("Enjoy your ride");
        }else {
            System.out.println("Sorry, you do not meeet the height requirement.");
        }

        System.out.println("This is the end of my code");
    }
}
