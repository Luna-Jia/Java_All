package objectsAndClass;

import javax.swing.*;

public class Test351 {

    public static void main(String[] args) {
        Count myCount = new Count(); // Create an object myCount from Count class (Count class need to have constructor)
        int times = 0; // data field

        for(int i = 0; i < 100; i++)
            increment(myCount, times);

        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);
    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }
}
