package Zoom5_10_OOP;

public class Increment_Demo {

    public static int increment(int x){
        return ++x;
    }

    public static void main(String[] args){

        int x =5;
        System.out.println("Before increment: " + x);

        System.out.println("After increment: " + increment(x));

    }
}
