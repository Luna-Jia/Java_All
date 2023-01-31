package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,36));
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if ((summer && temperature>=25 && temperature<=45) || (!summer && temperature>=25 && temperature<=35) ) {
            return true;
        } else {
            return false;
        }

    }

}
