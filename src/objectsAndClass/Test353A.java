package objectsAndClass;

import java.util.Date;

public class Test353A {

    public static void main(String[] args) {
        Date date = null;
        method1(date);
        System.out.println(date);
    }

    public static void method1 (Date date) {
        date = new Date();
    }
}
