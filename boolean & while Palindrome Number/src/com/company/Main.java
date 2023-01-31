package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int startingNr = number;
        while (number!=0){
            int lastDigit = number % 10;
            reverse=reverse*10+lastDigit;
            number/=10;
        }
        return startingNr==reverse;
    }
}
