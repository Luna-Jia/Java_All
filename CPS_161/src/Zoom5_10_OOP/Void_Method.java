package Zoom5_10_OOP;

public class Void_Method {

    public static void printSomething(String str) {
        System.out.println(str);
        return;                                        // The function of return:
    }                                                                            // 1> return a value out;
                                                                                // 2> terminate the method.
    public static void main(String[] args){
        printSomething("Hello");                  // invoke void method.
    }
}
