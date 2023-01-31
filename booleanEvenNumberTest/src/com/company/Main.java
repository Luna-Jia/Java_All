package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(3));
    }

    public static boolean isEvenNumber (int number) {
        if (number%2==0) {
            return true;
        } else {
            return false;
        }

    }


}
