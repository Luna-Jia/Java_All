package Inheritance_Polymorphism;

public class DynamicBindingTestA428 {

    public static void main(String[] args) {
        new Person__().printPerson();
        new Student__().printPerson();
    }
}

class Student__ extends Person__ {
    @Override
    public String getInfo() {
    return "Student"; }
}

class Person__ {
    public String getInfo() {
        return "Person"; }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
