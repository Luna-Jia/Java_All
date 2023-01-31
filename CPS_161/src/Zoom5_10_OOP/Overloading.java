package Zoom5_10_OOP;

public class Overloading {

    public static int max (int num1, int num2){                  // Overloading has same method name
        if (num1>num2){                                         // but different parameter list.
            return num1;
        }                                                       // Duplication is bad. Overloading is good.
        return num2;
    }

    public static int max(int num1, int num2, int num3){
        return max(max(num1,num2),num3);

    }

    public static void main(String[] args){
        System.out.println("The bigger number is: " + max(2,15,7));
    }
}
