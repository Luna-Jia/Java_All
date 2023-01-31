package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // Box Car         weight 53 tons, length 45.0 feet
        // Gondola Car     weight 65 tons, length 70.0 feet
        // Passenger Car   weight 70 tons, length 80.5 feet
        // locomotive 引擎  weight 52 tons, length 55.0 feet
        // 1 locomotive can pull weight 1000 tons.

        System.out.println("This program is written by Luna Jia");

        int numberOfBoxCars = 2;
        int numberOfGondolaCars = 3;
        int numberOfPassengerCars = 5;
        int numberOfTotalCars = numberOfBoxCars + numberOfGondolaCars + numberOfPassengerCars;
        int totalWeightOfCars = numberOfBoxCars * 53 + numberOfGondolaCars * 65 + numberOfPassengerCars * 70;


        System.out.println("Enter number of Box cars:" + numberOfBoxCars);
        System.out.println("Enter number of Gondola cars:" + numberOfGondolaCars);
        System.out.println("Enter number of Passenger cars:" + numberOfPassengerCars);
        System.out.println("The train is" + numberOfTotalCars + "cars long and consists of:");
        System.out.println(numberOfBoxCars + "box cars");
        System.out.println(numberOfGondolaCars + "gondola cars");
        System.out.println(numberOfPassengerCars + "passenger cars");


        System.out.println("The total weight of the cars is" + totalWeightOfCars + "tons");


    }
}
