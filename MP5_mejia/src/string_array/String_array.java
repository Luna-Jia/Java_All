package string_array;

import java.util.Arrays;

public class String_array {
    /*
    write a program that creates an array of Strings with the
name of "firstNames".
Fill the array with the names(in this order): "George", "Fred", "Sam", "Mary", "Sarah", "Bella",
"Joy", "Rita", "Marta", "Sue", "Nancy"
Print the values of the firstNames array backwards. In otherwords, your output should be:
Nancy Sue Marta Rita Joy Bella Sarah Mary Sam Fred George
     */

    public static void main(String[] args){
        String[] firstNames = {"George", "Fred", "Sam", "Mary", "Sarah", "Bella", "Joy", "Rita", "Marta", "Sue", "Nancy"};
        reverse(firstNames);
        System.out.println(Arrays.toString(firstNames));
    }

    private static void reverse(String[] firstNames){

        int maxIndex = firstNames.length -1;
        int halfLength = firstNames.length / 2;
        for (int i=0; i<halfLength; i++){
            String temp = firstNames[i];
            firstNames[i] = firstNames[maxIndex - i];
            firstNames[maxIndex - i] = temp;
        }

    }
}
