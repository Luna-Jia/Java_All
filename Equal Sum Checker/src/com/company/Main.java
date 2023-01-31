package com.company;

//The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
//
//
//EXAMPLES OF INPUT/OUTPUT:
//
//* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
//
//* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
//
//* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
//
//

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(3,4,5));
    }


    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int sum = num1 + num2;
        return sum == num3? true:false;



    }

}
