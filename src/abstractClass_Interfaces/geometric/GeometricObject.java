package abstractClass_Interfaces.geometric;

public abstract class GeometricObject {

    // Data field
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Construct a default geometric object
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with color and filled value
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Return color
    String getColor() {
        return color;
    }

    // Set a new color
    void setColor(String color) {
        this.color = color;
    }

    // Return filled. Since filled is boolean, the get method is named isFilled.
    boolean isFilled() {
        return filled;
    }

    // Set a new filled
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Get dateCreated
    java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    // Abstract method getArea
   public abstract double getArea();

    // Abstract method getPerimeter
    abstract double getPerimeter();
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/GeometricObjectWithLineNumber.html?