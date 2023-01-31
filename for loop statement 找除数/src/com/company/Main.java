package com.company;

public class Main {

    public static void main(String[] args) {

        printFactors(34);

    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; number >= i; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
