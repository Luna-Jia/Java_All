package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(isLeapYear(400));

    }


    public static boolean isLeapYear(int year) {


        int remind2 = year % 400;
        int remind1 = year % 4;
        int remind3 = year % 100;

        if (year < 1 || year > 9999) {
            return false;
        } else if (0 == remind2 && remind1 ==0 && remind3 ==0) {
            return true;
        } else if (remind1!=0){
            return false;
        } else if (remind1 == 0 && remind3!=0 ){
            return true;
        }
        return false;
    }
}