package Inheritance_Polymorphism;

class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {

    public Employee(String s) {
        System.out.println(s);
    }

    public Employee() {
        this("(2) Invokes Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
}

public class InheritanceFaculty extends Employee {
    public static void main(String[] args) {
        new InheritanceFaculty();
    }

    public InheritanceFaculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
}

// 11.3.2 Constructor Chaining.  Page 419
//  When constructing an object of a subclass, the subclass constructor first invokes its superclass constructor before
//  performing its own tasks. If the superclass is derived from another class, the superclass constructor invokes its
//  parent-class constructor before performing its own tasks. This process continues until the last constructor along
//  the inheritance hierarchy is called. This is called constructor chaining.

