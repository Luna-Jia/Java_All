package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("****************");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit


    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}

// Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//
//Check that number is > 0, if it is not return false.
//
//If number is odd return true, otherwise  return false.
//
//Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//
//The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
//
//It should call the method isOdd to check if each number is odd.
//
//The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//
//If those conditions are not satisfied return -1 from the method to indicate invalid input.
//
//Example input/output:
//
//* sumOdd(1, 100); → should return 2500
//
//* sumOdd(-1, 100); →  should return -1
//
//* sumOdd(100, 100); → should return 0
//
//* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
//
//* sumOdd(100, -100); → should return -1
//
//* sumOdd(100, 1000); → should return 247500
//
//
//TIP: use the remainder operator to check if the number is odd
//
//NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
//NOTE: Do not add a  main method to solution code.
