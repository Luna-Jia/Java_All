package Inheritance_Polymorphism;

public class Test_429 {
    public static void main(String[] args) {
        new A_429();
        new B_429();
    }
}

class A_429 {
    int i = 7;

    public A_429() {
        setI(20);
        System.out.println("i from A_429 is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B_429 extends A_429 {
    public B_429() {
        System.out.println("i from B_429 is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}

// Dynamic binding. Page 426