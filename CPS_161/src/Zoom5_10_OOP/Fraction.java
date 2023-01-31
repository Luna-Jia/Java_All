package Zoom5_10_OOP;

import java.util.Scanner;

/**
 * Created by Tom's Desktop on 3/9/2016.
 *
 * Define a class called Fraction. This class is used to represent a ratio of two integers.
 * Include mutator methods that allow the user to set the numerator and the
 * denominator. Also include a method that returns the value of numerator divided
 * by denominator as a double. Include an additional method that outputs the value
 * of the fraction reduced to lowest terms (e.g., instead of outputting 20/60, the
 * method should output 1/3). This will require finding the greatest common divisor
 * for the numerator and denominator, then dividing both by that number. Embed
 * your class in a test program.
 *
 *
 * Fraction
 *  - ratio of two integers [int1]/[int2]
 *  - numerator = int1
 *      - have a mutator method that allows the change of numerator
 *  - denominator = int2
 *      - have a mutator method that allows the change of denominator
 *  - method that outputs the value as a double
 *  - method that reduces the fraction to lowest terms
 *      - need greatest common divisor
 *  -
 *
 *
 *
 *
 *
 */

public class Fraction
{
    //Instance variables
    private Scanner scan = new Scanner(System.in);
    private int num;
    private int den;

    //------Constructors------
    // Default
    public Fraction()
    {
        num = den = 1;
    }
    // 1 argument
    public Fraction(int x)
    {
        num = x;
        den = 1;
    }
    // 2 arguments
    public Fraction(int x, int y)
    {
        num = x;
        den = y;
    }
    //------Accessor Methods------
    // Return numerator
    public int getNum()
    {
        return num;
    }

    public void setFraction(int n, int d)
    {
        n = this.num;
        d = this.den;
    }

    // Return denominator
    public int getDen()
    {
        return den;
    }
    //------Mutator Methods------
    // Change Numerator
    public void changeNum(int x)
    {
        num = x;
    }
    // Change Denominator
    public void changeDen(int y)
    {
        den = y;
    }

    //------Helper Methods------
    // Method to get greatest common divisor
    private int gcd(int x, int y)
    {
        int rem;

        // Check if dividing by 0
        if(y == 0)
            System.out.println("Error: Divisor = 0");

        // while there is a remainder gcd not found
        //  - make y the dividend
        //  - make rem the divisor
        //  - if rem != 0 repeat until so
        //      - when rem = 0, that means y is the gcd
        //      - return y
        rem = x % y;
        while (rem > 0)
        {
            x = y;
            y = rem;
            rem = x % y;
        }
        // when comes out of loop y contains gcd
        return y;
    }

    // Method to display value of ratio as a double
    public double doubleResult()
    {
        double x = num;
        double y = den;

        return (x/y);
    }

    // Method to reduce numerator
    public int reducedNum()
    {
        // get the gcd
        int gcd = Fraction.this.gcd(num,den);
        // return
        return num/gcd;
    }
    // Method to reduce denominator
    public int reducedDen()
    {
        // get the gcd
        int gcd = Fraction.this.gcd(num,den);
        // return
        return den/gcd;
    }

    public void readin(String label)
    {
        while (true) // Keep trying if bad input is received
        {
            System.out.print(label);
            String temp = scan.next();
            temp = temp.trim(); // get rid of white space at the beginning
            int index = temp.indexOf('/');
            if (index >= 0)
            {
                String numStr = temp.substring(0, index);
                String denomStr = temp.substring(index+1);
                int n = Integer.parseInt(numStr);
                int d = Integer.parseInt(denomStr);
                setFraction(n,d);
                return;
            }
            else
                System.out.println("Input Fraction missing / ");
        }//Keep trying until you get it right
    }

    public static void main(String[] args)
    {
        Fraction f1= new Fraction();
        Fraction f2= new Fraction();
        Fraction f3=null;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println(); // Add a blank line
            System.out.print("Enter operation: + - * / q (q ==> quit) : ");
            String input = scan.next();
            if (input.charAt(0) == 'q')
                break; // All done

            f1.readin("Enter Fraction 1: ");
            f2.readin("Enter Fraction 2: ");
            System.out.println("f1 = " + f1);
            System.out.println("f2 = " + f2);

            if (f1.equals(f2))
                System.out.println("f1 and f2 are equal");
            else
                System.out.println("f1 and f2 are not equal");
/*
            switch (input.charAt(0))
            {
                case '+':
                    f3 = f1.add(f2);
                    System.out.println("f1+f2=" + f3);
                    break;
                case '-':
                    f3 = f1.subtract(f2);
                    System.out.println("f1-f2=" + f3);
                    break;
                case '*':
                    f3 = f1.multiply(f2);
                    System.out.println("f1*f2="+f3);
                    break;
                case '/':
                    f3 = f1.divide(f2);
                    System.out.println("f1/f2="+f3);
                    break;
                default:
                    System.out.println("Illegal command: " + input );
                    break;
            }*/
        }// end of while loop
        System.out.println("Bye");

    } // end of main

}
