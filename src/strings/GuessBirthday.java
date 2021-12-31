package strings;
import java.util.Scanner;
public class GuessBirthday {
    public static void main(String[] args) {
        String set1 =
                      " 1 3 5 7\n" +
                      " 9 11 13 15\n" +
                      "17 19 21 23\n" +
                      "25 27 29 31";

        String set2 =
                        " 2 3 6 7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                        " 4 5 6 7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                        " 8 9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                        "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1)
            day += 1;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day +=2;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 4;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 8;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 16;

        System.out.println("\nYour birthday is " + day + "!");
    }
}

// Intro to Java-Daniel Liang Page 143
// The birthday is the sum of the first numbers in the sets where the day appears.
// This is a program that prompts the user to answer whether the day is in Set1 (lines 41–44), in Set2 (lines 50–53), in
// Set3 (lines 59–62), in Set4 (lines 68–71), and in Set5 (lines 77–80). If the number is in the set, the program adds
// the first number in the set to day (lines 47, 56, 65, 74, and 83).