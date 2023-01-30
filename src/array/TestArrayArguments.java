package array; public class TestArrayArguments {
    public static void main(String[] args) { // The program starts the execution from the main method
        int x = 1; // x represents an int value. // The statement declares variable x with initial value 1.
        int[] y = new int[10]; // y represents an array of int values. // The statement creates an array of 10 int values initialized to 0.

        m(x,y); // Invoke method m with arguments x and y

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    } // The main method exits. The program is finished.

    public static void m(int number, int[] numbers) { // The value of x is passed to number, and the value of y to numbers. y contains a reference value to the array. Now numbers and y reference the same array.
        number = 1001; // Assign a new value to number. // Value 1001 is assigned to number.
        numbers[0] = 5555; // Assign a new value to numbers[0]. // Value 5555 is assigned to numbers[0].
    } // The method is finished and will be returned to the main method.
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/TestArrayArguments.html

// ava uses pass-by-value to pass arguments to a method. There are important differences between passing the values of variables of primitive data types and passing arrays.
//■■ For an argument of a primitive type, the argument’s value is passed.
//■■ For an argument of an array type, the value of the argument is a reference to an array; this reference value is passed to the method. Semantically, it can be best described as pass-by-sharing, that is, the array in the method is the same as the array being passed. Thus, if you change the array in the method, you will see the change outside the method.
//Take the following code, for example: