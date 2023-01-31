package com.company;

public class Main {

    public static void main(String[] args){
        System.out.println(hasSameLastDigit(23,33,569));
    }

    public static boolean hasSameLastDigit (int x, int y, int z) {

        if (x>=10 && x<=1000 && y>=10 && y<= 1000 && z >=10 && z<=1000 ) {
            int lastDigitX = x % 10;
            int lastDigitY = y % 10;
            int lastDigitZ = z % 10;

            return lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ;
        }else return false;
    }

    public static boolean isValid (int number) {
        if (number>=10 && number<=1000){
            return true;
        } else return false;
    }
}
