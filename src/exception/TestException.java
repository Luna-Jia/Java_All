package exception;
public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1, 2, 3, 4, 5})); //  Line 4 invokes the sum method to return the sum of all the elements in the array.
        }
        catch (Exception ex) {
            ex.printStackTrace(); // Lines 7, 8, and 9 display the stack trace, exception message, and exception object and message using the printStackTrace(), getMessage(), and toString() methods
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace(); //  Line 12 brings stack trace elements into an array. Each element represents a method call.
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName()); // You can obtain the method (line 14),
                System.out.print("(" + traceElements[i].getClassName() + ":"); // class name (line 15),
                System.out.println(traceElements[i].getLineNumber() + ")"); // and exception line number (line 16) for each element.
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) // There is an error in line 23 that causes the ArrayIndexOutOfBoundsException, a subclass of IndexOutOfBoundsException.This exception is caught in the try-catch block.
            result += list[i];
        return result;
    }
}

// an example that uses the methods in Throwable to display exception information
