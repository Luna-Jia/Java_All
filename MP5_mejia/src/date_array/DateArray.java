package date_array;

import java.util.Arrays;

/*
The array should have 4 entries and the entries should be filled with MyDate classes representing
the dates:
May 16, 1984
November 14, 1978
September 21, 1980
July 3, 1987
The DateArray class should print the values of the dateArr array backwards. Your MyDate classes
can be printed using a toString() method in the MyDate class.
 */
public class DateArray {

    public static void main(String[] args) {
        MyDate date1 = new MyDate("May",16,1984);
        MyDate date2 = new MyDate("November",14,1978);
        MyDate date3 = new MyDate("September",21,1980);
        MyDate date4 = new MyDate("July",3,1987);

        String[] dateArr = {date1.toString(), date2.toString(), date3.toString(), date4.toString()};
        reverse(dateArr);
        System.out.println(Arrays.toString(dateArr));
    }
    private static void reverse(String[] dateArr){

        int maxIndex = dateArr.length -1;
        int halfLength = dateArr.length / 2;
        for (int i=0; i<halfLength; i++){
            String temp = dateArr[i];
            dateArr[i] = dateArr[maxIndex - i];
            dateArr[maxIndex - i] = temp;
        }

    }
}
