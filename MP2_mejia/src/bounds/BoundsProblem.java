package bounds;

import java.util.Scanner;

public class BoundsProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter starting number: ");
        int startNum = sc.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = sc.nextInt();

        System.out.print("Enter step size: ");
        int stepSize = sc.nextInt();

        int counter = 0;
        for (int i = startNum; i <= upperBound; i = i + stepSize) {
                    System.out.print(i+" ");
                        counter++;
                    if (counter%10==0){
                        System.out.println();
                    }
            }

    }
}
