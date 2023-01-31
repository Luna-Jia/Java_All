package colorableCode;

import java.util.Objects;

public abstract class Shape implements Colorable {
    private static int totalShapes = 0;

    private String color = "Red";

    abstract double getPerimeter();
    abstract double getArea();

    public void setColor(String c){
        color = c;
    }

    public String getColor() {
        return color;
    }

    public static int getCount(){
        return totalShapes;
    }

    public Shape (String c){
        color = c;
        totalShapes +=1;
    }

    public double getAPRatio(){
        return getArea()/getPerimeter();
    }
    public boolean equals(Object ob){
        if (ob != null && getClass()== ob.getClass()){
            Shape s = (Shape)ob;
            if (color.equals(s.color))
                return true;
        }
        return false;
    }
    public String toString(){
        return "Shape color=" + color;
    }
}

class Circle extends Shape{
    private double radius;
    private static int totalCircles = 0;

    public static int getCount(){
        return totalCircles;
    }

    public double getRadius(){
        return radius;
    }

    Circle(String c, double r){
        super(c);
        radius =r;
        totalCircles +=1;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2*Math.PI *radius;
    }

    public String toString(){
        return super.toString()+" Circle with radius=" + radius;
    }
    public boolean equals(Object ob){
        if (ob != null && getClass()== ob.getClass()){
            Circle circle = (Circle)ob;
            if (super.equals(ob) && radius == circle.radius){
                return true;
            }
        }
        return false;
    }
}
