package com.company;

public class Main {

    public static void main(String[] args) {

        double value1 = 20.00;
        double value2 = 80.00;
        double totalValue = (value1 + value2)*100.00;
        System.out.println("Total Value =" + totalValue);
        double reminder = totalValue % 40;
        System.out.println("Remainder =" + reminder);

        boolean value = (reminder == 0) ? true : false;
        System.out.println("The value is " + value);
        if (!value) {
            System.out.println("Got some remainder");
        }



        }
    }

