package com.company;

public class Main {
    public static void main(String[] args) {
        boolean shouldWakeUp(boolean barking, 3);
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
    }
        //1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
        //2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
        //
        //In all other cases return false.
        //
        //If the hourOfDay parameter is less than 0 or greater than 23 return false.
        //
        //Examples of input/output:
        //
        //* shouldWakeUp (true, 1); → should return true
        //
        //* shouldWakeUp (false, 2); → should return false since the dog is not barking.
        //
        //* shouldWakeUp (true, 8); → should return false, since it's not before 8.
        //
        //* shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
        //
        //
        //TIP: Use the if else statement with multiple conditions.


}
