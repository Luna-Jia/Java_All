package Ch3_Input_Output;

import java.util.Scanner;

public class ScannerBug {
    /**
     * Demonstrates a common problem using Scanner.
     */

        public static void main(String[] args) {
            String name;
            int age;
            Scanner in = new Scanner(System.in);
            System.out.print("What is your name? ");
            name = in.nextLine();
            System.out.print("What is your age? ");
            age = in.nextInt();
            System.out.printf("Hello %s, age %d\n", name, age);

            in.reset();
            System.out.println();

            System.out.print("What is your age? ");
            age = in.nextInt();
            System.out.print("What is your name? ");
            name = in.nextLine();
            System.out.printf("Hello %s, age %d\n", name, age);
        }

}
