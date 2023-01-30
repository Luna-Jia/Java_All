package Inheritance_Polymorphism;

public class TestOverloading {
    public static void main(String[] args) {
        A_ a = new A_();
        a.p(10);
        a.p(10.0);
    }
}

class B_ {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A_ extends B_ {
    // This method overloads the method in B
    public void p(int i) {
        System.out.println(i);
    }

}
