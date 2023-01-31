package Zoom8_15_Array;
/*
Define and initialize array.
 */
public class Initialize_Array_Udemy99 {

    public static void main(String[] args){
        /* 方法一：not efficient:

        int[] myIntArray = new int[10];
        double[] myDoubleArray = new double[10];

        myIntArray[0] = 45;
        myIntArray[1] = 476;
        myIntArray[5] = 50;

        System.out.println(myIntArray[0]);

        */


        /* 方法二：efficient

       int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        */

        // 方法三：

        int[] myIntArray = new int[25];
        for (int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
            // System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
       /* for (int i=0; i<10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        */

       printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
