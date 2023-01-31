package Module3_IfElse;

import java.util.Scanner;

public class Zoom7_LotteryGame {

    public static void main(String[] args){

        int rand = (int) (Math.random()*90 + 10);
        int randTenth;
        int randOnes;
        int userTenth;
        int userOnes;
        int userInput;
        Scanner kbInput = new Scanner(System.in);
        System.out.println(rand);
        System.out.println("Please enter your number:");
        userInput = kbInput.nextInt();
        randTenth = rand / 10;
        randOnes = rand % 10;
        userTenth = userInput / 10;
        userOnes = userInput % 10;

        if (userInput == rand){
            System.out.println(" You won $10,000");
        } else if (randTenth == userOnes && randOnes == userTenth){
            System.out.println("You won $3,000");
        } else if (randTenth == userTenth || randOnes == userOnes || randTenth == userOnes || randOnes ==userTenth) {
            System.out.println("You won $1,000");
        } else {
            System.out.println("Better luck next time");
        }



    }


}
