package Zoom8_15_Array;

import java.util.Scanner;

public class Array_Sum_Average_Udemy99 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length;i++){
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + "integer values. \r");
        int[] value = new int[number];// Define Array

        for (int i=0;i<value.length;i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}
