package myClass;

class MyClass1{
    void doit()
    {
        System.out.println("doit");
    }
}

class MyClass2{
    int x=1;
    MyClass2(int x)
    {
        this.x =x;
    }
    void doit()
    {
        System.out.println("doit"+x);
    }
}
