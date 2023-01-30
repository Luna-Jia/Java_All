package Inheritance_Polymorphism;

import Inheritance_Polymorphism.geometric.Circle;
import Inheritance_Polymorphism.geometric.GeometricObject;
import Inheritance_Polymorphism.geometric.Rectangle;

public class PolymorphismDemo {

    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1,"red",false)); // polymorphic call
        displayObject(new Rectangle(1,1,"black",true));
    }

    //Display geometric object properties
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}

// Page 425.

// The method displayObject (line 16) takes a parameter of the GeometricObject type. You can invoke displayObject by
// passing any instance of GeometricObject (e.g., new Circle(1, "red", false) and new Rectangle(1, 1, "black", true) in
// lines 11 and 12). An object of a subclass can be used wherever its superclass object is used. This is commonly known as
// polymorphism (from a Greek word meaning “many forms”). In simple terms, polymorphism means that a variable of a
// supertype can refer to a subtype object.