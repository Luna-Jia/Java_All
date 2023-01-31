package Module2_Scanner;

public class Zoom4_StringMethod {

    public static void main (String[] args) {
        String myStr = "Today is Tuesday";

        int myStrLength=myStr.length();
        System.out.println(myStrLength);

        System.out.println(myStr.charAt(0));

        System.out.println(myStr.toLowerCase());
        System.out.println(myStr.toUpperCase());
        //doesn't change original string.

        System.out.println(myStr.substring(2)); // 从index2 开始显示
        System.out.println(myStr.substring(0,5)); // 显示index 0～4

        System.out.println(myStr.indexOf('T')); // 显示T的index位置。
        System.out.println(myStr.indexOf('T',2)); //从index2开始寻找T，显示其index位置。
        System.out.println(myStr.indexOf('O')); // 显示-1 如果不存在。

        System.out.println(myStr.equals("Today is Wedsnday")); //对比string，显示true or false.


    }
}
