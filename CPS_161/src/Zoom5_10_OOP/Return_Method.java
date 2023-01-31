package Zoom5_10_OOP;

public class Return_Method {

    public static int add(int num1, int num2){
                                                         //{ method body }
        int total;                                      // local variable to add method
        total = num1 + num2;

        return total;                                   // return must match the type int.

    }

    public static void main(String[] args){
                                                            // invoke method add: way 1
        System.out.println(add(1,2));                        // serve as an int.
        System.out.println(5+add(1,2));

        int num = 5;                                        // Wrapper class
        Integer myNum;
        myNum = num;

        System.out.println(Math.abs(-7));
        System.out.println(Character.isDigit('7'));

        int total;                                          // invoke method add: way 2
        total = add(3,4);
        System.out.println(total);
                                                            // invoke method add: way 3
        int firstNum = 5;
        int secondNum = 9;
        int total2;
        total2 = add(firstNum,secondNum);
        System.out.println(total2);


    }
}
