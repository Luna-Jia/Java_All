package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = Math.round((double)sum/ (double) count);


            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
