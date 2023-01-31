package Zoom5_10_OOP;

public class ReturnBiggerNum_MethodExercise1 {

    public static int max(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{                                                          //remember to include return for all conditions.
            return num2;
        }
    }

    public static void main(String[] args) {
        System.out.println("The bigger number is " + max(3,4));
    }
}
