package exception.customExceptionClass;
public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5); // Invoking new CircleWithCustomException(−5)(line6) throws an InvalidRadiusException, which is caught by the handler. The handler displays the radius in the exception object ex.
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    // The radius of the circle
    private double radius;

    // The number of objects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius 1
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }
// Since the constructors for CircleWithCustomException invoke the setRadius method to set a new radius, and it may throw an InvalidRadiusException, the constructors are declared to throw InvalidRadiusException (lines 25 and 30).
    // Construct a circle with a specified radius
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {

        setRadius(newRadius);
        numberOfObjects++;
    }

   // Return radius
   public double getRadius() {
        return radius;
   }

   // Set a new radius // Since InvalidRadiusException is a checked exception, the setRadius method must declare it in the method header (line 42).
    public void setRadius(double newRadius) throws InvalidRadiusException {

        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius); // The setRadius method in CircleWithCustomException throws an InvalidRadiusException when radius is negative (line 47).
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double findArea() {
        return radius * radius * 3.14159;
    }
}