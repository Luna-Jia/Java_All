package Inheritance_Polymorphism;

public class Test_428c {
    public static void main(String[] args) {
        A_428c a_428c = new A_428c(3);
    }
}

class A_428c extends B_428c {
    public A_428c(int t) {
        System.out.println("A's constructor is invoked");
    }
}

class B_428c {
    public B_428c() {
    System.out.println("B's constructor is invoked");
    }
}
