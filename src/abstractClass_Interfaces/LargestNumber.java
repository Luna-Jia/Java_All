package abstractClass_Interfaces;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>(); // The program creates an ArrayList of Number objects (line 8)
        list.add(45); // Add an integer // 45 is automatically converted into an Integer object and added to the list in line 11
        list.add(3445.53); // Add a double // 3445.53 is automatically converted into a Double object and added to the list in line 12 using autoboxing.
        // Add a BigInteger
        list.add(new BigInteger("3432323234344343101"));
        // Add a BigDecimal
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
}

// The doubleValue() method is defined in the Number class and implemented in the concrete subclass of Number. If a
// number is an Integer object, the Integer’s doubleValue() is invoked. If a number is a BigDecimal object, the
// BigDecimal’s doubleValue() is invoked.
//If the doubleValue() method was not defined in the Number class, you will not be able to find the largest number among
// different types of numbers using the Number class.