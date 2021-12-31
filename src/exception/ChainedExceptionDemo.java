package exception;
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try { method1(); // The main method invokes method1 (line 4)
        }
        catch (Exception ex) {
            ex.printStackTrace(); //  The sample output shows the output from the printStackTrace() method in line 7.
        }
    }

    public static void method1() throws Exception {
        try {
            method2(); // method1 invokes method2 (line 13)
        }
        catch (Exception ex) {
            throw new Exception("New info from method1", ex);
        } // The new exception is thrown and caught in the catch block in the main method in line 6.
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2"); // method2 throws an exception (line 21)
    } // This exception is caught in the catch block in method1 and is wrapped in a new exception in line 16.
}
