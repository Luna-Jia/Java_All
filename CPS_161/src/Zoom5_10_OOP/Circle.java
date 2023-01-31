package Zoom5_10_OOP;

public class Circle {

    public static final double PI = 3.14159;        // static variable(like public kitchen), PI doesn't belong to any specific object,
                                                    // but belongs to this class
    public int radius;

    public static void displayPI(){                 // static method cannot have instant variable

    }

    public Circle(int radius){                       // instructor
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }
    public double getCircum() {
        return PI * 2 * radius;
    }

    public String toString(){
        return "the radius is: " + radius + "\n"
                + "the area is: " + getArea() + "\n"
                + "the circum is: " + getCircum() + "\n"
                + "PI is: " + PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        Circle.displayPI();

    }
}
