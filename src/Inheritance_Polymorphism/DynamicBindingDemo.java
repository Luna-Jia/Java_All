package Inheritance_Polymorphism;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person_());
        m(new Object());

    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
}

class Student extends Person_ {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person_ extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
