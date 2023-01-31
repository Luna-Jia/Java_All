package com.company;

public class Main {

    public static void main(String[] args) {

        double weight = 17.4;
        if (weight > 0 && weight <= 1) {
            double price = 83;
            System.out.println(price);
        } else if (weight > 1 && weight <= 10) {
            double price = 83 + Math.ceil(weight - 1) * 0.5 * 22;
            System.out.println(price);
        } else if (weight > 10 && weight <= 21) {
            double price = Math.ceil(weight) * 43;
            System.out.println(price);
        } else if (weight > 21 && weight <= 30) {
            double price = Math.ceil(weight) * 42;
            System.out.println(price);
        }


    }
}