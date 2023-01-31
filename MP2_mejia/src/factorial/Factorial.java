package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userResponse = "";

            do {
                System.out.print("Enter in N: ");
                int num = sc.nextInt();
                int factorial = 1;
            for (int i = num; i >= 1; i--) {
                factorial = factorial * i;
            }
                System.out.println("Factorial = " + factorial);

            System.out.print("Do you want to continue? (y/n): ");
            sc.nextLine();
            userResponse = sc.nextLine();
                System.out.println();
        } while (userResponse.equals("y"));

            if (userResponse.equals("n")){
                System.out.println("Have a good day");
            }

        sc.close();

    }
}
