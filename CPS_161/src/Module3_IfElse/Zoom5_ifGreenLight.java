package Module3_IfElse;

import java.util.Scanner;

// Check flow chart in zoom5 recording.
public class Zoom5_ifGreenLight {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        String light = "red";

        if (light.equals("Green")) {
            System.out.println("go");
        }else{
            if (light.equals("Yellow")){
                System.out.println("be careful");
            }else{
                System.out.println("stop");
            }
        }
        System.out.println("go to the store");
    }
}
