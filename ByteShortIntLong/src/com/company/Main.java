package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 16;
        short myShortValue = 20;
        int myIntValue = 300;
        long myLongValue = 50000L + (myByteValue + myShortValue + myIntValue)*10L;
        System.out.println(myLongValue);
    }
}
