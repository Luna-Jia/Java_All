package methods;
public class TestVoidMethod { // Use void method
    public static void main(String[] args) { // main method
        System.out.print("The grade is ");
        printGrade(78.5); // invoke printGrade

        System.out.print("The grade is ");
        printGrade(59.5);
    }

    public static void printGrade(double score) { // printGrade method // The printGrade method does not return any value, so it must be invoked as a statement.
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}

// Listing 6.2 gives a program that defines a method named printGrade and invokes it to print the grade for a given score.

// The printGrade method is a void method because it does not return any value. A call to a void method must be a
// statement. Therefore, it is invoked as a statement in line 4 in the main method. Like any Java statement, it is
// terminated with a semicolon.
