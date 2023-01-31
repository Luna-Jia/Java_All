package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(26));
    }
    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        if (number>=0 && number< 10) {
            int sum = number*2;
            return sum;
        }

        int sum = 0;
        int digit = number% 10;

        while (number>=10) {
            number/=10;
            sum = number + digit;
        }
        return sum;

    }
}
