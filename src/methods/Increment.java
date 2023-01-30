package methods;
public class Increment {
    public static void main(String[] args) {
        int x = 1; //  The variable x is not affected, regardless of the changes made to the parameter inside the method.
        System.out.println("Before the call, x is " + x);
        increment(x); // invoke increment // the argument is a variable x rather than a literal value, the value of the variable is passed to the parameter. // the value of x (1) is passed to the parameter n to invoke the increment method (line 6).
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        n++; // increment n // The parameter n is incremented by 1 in the method (line 11), but x is not changed no matter what the method does.
        System.out.println("n inside the method is " + n);
    }
}

// When you invoke a method with an argument, the value of the argument is passed to the parameter. This is referred to
// as pass-by-value. If the argument is a variable rather than a literal value, the value of the variable is passed to
// the parameter. The variable is not affected, regardless of the changes made to the parameter inside the method. As
// given in Listing 6.4, the value of x (1) is passed to the parameter n to invoke the increment method (line 6). The
// parameter n is incremented by 1 in the method (line 10), but x is not changed no matter what the method does.
