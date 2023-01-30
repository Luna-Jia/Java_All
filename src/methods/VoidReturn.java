package methods;
// This is not often done, but sometimes it is useful for circumventing the normal flow of control in a void method.
// For example, the following code has a return statement to terminate the method when the score is invalid:
public class VoidReturn {
    public static void printGrade(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return; // A return statement is not needed for a void method, but it can be used for terminating the method and returning to the method’s caller. The syntax is simply return;
        }

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
