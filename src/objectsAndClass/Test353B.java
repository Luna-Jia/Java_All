package objectsAndClass;
import java.util.Date;

public class Test353B {

    public static void main(String[] args) {

        Date date = new Date(1234567);
        method1(date);
        System.out.println(date.getTime());
    }

    public static void method1(Date date) {
        date = new Date(7654321);
    }
}
