package exception.customExceptionClass;
public class InvalidRadiusException extends Exception { // This custom exception class extends java.lang.Exception (line 2). The Exception class extends java.lang.Throwable. All the methods (e.g., getMessage(), toString(), and printStackTrace()) in Exception are inherited from Throwable.
    private double radius;
    // Construct an exception
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius); // Line 6 invokes the superclass’s constructor with a message. This message will be set in the exception object and can be obtained by invoking getMessage() on the object.
        this.radius = radius;
    }

    // Return the radius
    public double getRadius() {
        return radius;
    }
}
