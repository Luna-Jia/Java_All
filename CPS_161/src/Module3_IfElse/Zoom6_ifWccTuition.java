package Module3_IfElse;

import java.util.Scanner;

public class Zoom6_ifWccTuition {
    public static void main(String[] args){
        Scanner kbInput = new Scanner(System.in);

        String answer;
        double rate;
        int creditHrs;
        double tuition;

        System.out.println("are you taking face to face classes?");
        answer = kbInput.nextLine();
        if (answer.charAt(0)=='y') { //或者 answer.toLowerCase().equals("yes") // 或者 answer.toLowerCase().charAt(0)=='y'
            System.out.println("are you in district?");
            answer = kbInput.nextLine();
            if (answer.charAt(0)=='y'){
                rate = 95;
            } else {
                rate = 164;
            }
        } else {
            System.out.println("are you in district?");
            answer = kbInput.nextLine();
            if (answer.charAt(0)=='y'){
                rate = 108;
            }else{
                rate = 117;
            }
        }
        System.out.println("enter the number of credits:");
        creditHrs = kbInput.nextInt();
        tuition = creditHrs * rate;
        System.out.printf("rate is: $%.2f\n",rate);
        System.out.printf("tuition is $%.2f: ", tuition);
    }
}
