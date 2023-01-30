package methods;
public class TestMax {
    public static void main(String[] args) { // main method // The main method is just like any other method, except that it is invoked by the JVM to start the program.
        int i = 5;
        int j = 2;
        int k = max(i,j); // invoke max // The statements in main may invoke other methods that are defined in the class that contains the main method or in other classes. In this example, the main method invokes max(i, j), which is defined in the same class with the main method.
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }


    // Return the max of two numbers
    public static int max(int num1, int num2) { // define method
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}

// Listing 6.1 presents a complete program that is used to test the max method.

// This program contains the main method and the max method.

// The main method’s header is always the same. Like the one in this example, it includes the modifiers public and
// static, return value type void, method name main, and a parameter of the String[] type. String[] indicates the
// parameter is an array of String, a subject addressed in Chapter 7.

// When the max method is invoked (line 6), variable i’s value 5 is passed to num1 and vari- able j’s value 2 is passed
// to num2 in the max method. The flow of control transfers to the max method and the max method is executed. When the
// return statement in the max method is executed, the max method returns the control to its caller