package com.company;

public class Main {

    public static void main(String[] args) {
        long miles = toMilesPerHour(1.5);
        System.out.println("miles = " + miles);

        Main.printConversion(1.5);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km/= " + milesPerHour + " mi/h ");
    }

}
