package methods;
public class MethodDemo {
    public static int sum(int i1, int i2) { // define sum method // lines 3-9 define the method
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;

        return result;
    }

    public static void main(String[] args) { // main method
        System.out.println("Sum from 1 to 10 is " + sum(1,10)); // invoke sum
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));
    }
}

// The statements in the main method invoke sum(1, 10) to compute the sum from 1 to 10, sum(20, 37) to compute the sum
// from 20 to 37, and sum(35, 49) to compute the sum from 35 to 49.
