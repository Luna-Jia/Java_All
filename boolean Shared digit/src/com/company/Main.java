package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(99,9));
    }

    public static boolean hasSharedDigit (int x, int y) {

        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            int lastDigitX = x % 10;
            int firstDigitX = x / 10;
            int lastDigitY = y % 10;
            int firstDigitY = y / 10;

            return lastDigitX == lastDigitY || lastDigitX == firstDigitY || firstDigitX == lastDigitY || firstDigitX == firstDigitY;
        }else return false;

    }

}
