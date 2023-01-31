package Module3_IfElse;

import java.util.Random;

public class Zoom7_RandomNumber {

    public static void main(String[] args){

        //Math class: 求绝对值
        System.out.println(Math.abs(-6)); // absolute value for -6

        // generate random number, 方法一：利用Math class 👇

        System.out.println(Math.random()); //输出随机小数double，总是>=0, <1
        System.out.println(Math.random()*100); // 输出double, 0<=x<100
        System.out.println((int)(Math.random()*100)); // 输出int,利用cast，0<=X<100
        System.out.println((int)(Math.random()*100)+10); // 10<=x<110
        System.out.println((int)(Math.random()*90)+10); // 10<=x<100

        // generate random number, 方法二：利用Random class：👇

        Random rand = new Random(); //construct an object called rand, use the new keyword.
        System.out.println(rand.nextInt()); // use. to invoke the method called nextInt
                        // if not pass in any parameter, it will generate an int, with a huge range
        System.out.println(rand.nextInt(90)); // pass in one parameter 90, to set the upper bound as 90,
                                                     // so the random number will 0~90
        System.out.println(rand.nextInt(90)+10); // 输出int, 10~100



    }


}
