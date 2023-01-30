package Inheritance_Polymorphism;

public class DynamicBinding_Test428B {
    public static void main(String[] args) {
        new Person_428b().printPerson_428b();
        new Student_428b().printPerson_428b();
    }
}

class Student_428b extends Person_428b {
    private String getInfo() {
        return "Student";
    }
}

class Person_428b {
    private String getInfo() {
        return "Person";
    }

    public void printPerson_428b() {
        System.out.println(getInfo());
    }
}
