package exception.circle;
public class TestCircleWithException { public static void main(String[] args) {
     try { // The test program creates three CircleWithException objects—c1, c2, and c3—to test how to handle exceptions.
         CircleWithException c1 = new CircleWithException(5);
         CircleWithException c2 = new CircleWithException(-5); // Invoking new CircleWithException(−5) (line 5 in Listing 12.8) causes the setRadius method to be invoked, which throws an IllegalArgumentException, because the radius is negative.
         CircleWithException c3 = new CircleWithException(0);
    }
     catch (IllegalArgumentException ex) { // In the catch block, the type of the object ex is IllegalArgumentException, which matches the exception object thrown by the setRadius method, so this exception is caught by the catch block.
         System.out.println(ex); // The exception handler prints a short message, ex.toString() (line 9), about the exception, using System.out.println(ex).
     }

    System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());

    }
}


