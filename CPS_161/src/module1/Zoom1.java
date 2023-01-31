package module1;



public class Zoom1 {

    public static void main (String[] args){


        String myMessage = "Hello World!";
        // "String myMessage" 是 declaration, declare定义 variable(myMessage).
        // variable 的名字是 myMessage；
        // 在同一行 declaration 和 initialize the value（="hello World";
        // 在initialize the value 之前，你无法使用此variable；
        // method 里边的 variable 是 local variable， 对与local variable， 你必须自己手动 initialize it，才能使用。

        int numbOfStdn = 30;
        // "=" 叫做 assignment operator;

        double totalScore = 2500;
        double average;


        System.out.println("before:" + numbOfStdn);

        numbOfStdn = numbOfStdn - 2;
        average = totalScore / numbOfStdn;

        System.out.println("after:" + numbOfStdn);

        System.out.println("total score is: " + totalScore);
        System.out.println("average is " + average);

        System.out.println(myMessage);
    }
}
