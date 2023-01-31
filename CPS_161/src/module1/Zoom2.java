package module1;

public class Zoom2 {

    public static void main(String[] args) {

        // +, -, *, /, %
        //---------------------------------------------------------------
        // ++, - - [ Think Java 6.2: Increment and Decrement  ]

        int num1 = 5;
        num1++;
        num1++;
        System.out.println(num1 + " :num1 \n"); // 输出7。

        // 对比👇：------------------------------------------------
        int num2 = 5;

        System.out.println("num2++: " + num2++); // 输出 5。 【 ++ 放在后边，输出的是原始数值。】
        System.out.println(num2 + " :num2 \n"); // 输出 6。

        // 对比👇：------------------------------------------------
        int num3 = 5;

        System.out.println("++num3: "+ ++num3); // 输出6. 【++ 放前边，输出+1。】
        System.out.println("num3: "+ num3); // 输出6。

        //----------------------------------------------------------
        // 错误1：
        // int num1 = num1 + 2; 【没有 initialize variable num1.】修改 👇：

        // int num1 = 8;
        // int num1 = num1 +2; 【错误2：仍然不对。本行开头加上 int, 表示你又 declare 了一遍 variable，但是你只能 declare 一遍 variable。】修改 👇：
        //-----------------------------------------------------------
        // int num1 = 8;
        // num1 = num1 +2;  【 ✔。 本行还可以写成 👇：
        // num1 += 2; 【 本行更常见，因为好 type 。类似的还有 -=, *=, /=, %= . 】



    }
}
