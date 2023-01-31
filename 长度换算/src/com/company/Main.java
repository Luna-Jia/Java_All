package com.company;

public class SpeedConverter {


    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour<0) {
            System.out.println("invalid Value");

        } else if (kilometersPerHour>0){

            double mile = 1/1.609 * kilometersPerHour;
            long length = Math.round(mile);
            System.out.println(kilometersPerHour + " km/h = " + length + " m
        }

    }
}
