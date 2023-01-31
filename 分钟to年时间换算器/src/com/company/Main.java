package com.company;

public class Main {

    public static void main(String[] args) {


        printYearsAndDays(50000000);

    }
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        if (minutes >= 0) {

        long hours = minutes / 60;
        long remainningMinutes = (int) minutes % 60;
        long days = hours / 24;
        long remainningHours = hours % 24;
        long years = days / 365;
        long remainningDays = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + remainningDays + " d " + remainningHours + " h and " + remainningMinutes + " m");
        }
    }
}
