package myClass;

public class CallMyClass3 {
    MyClass2 mc2;
    void tryMe(){
        mc2 = new MyClass2(3);
        mc2.doit();
    }

    public static void main(String[] args){
        CallMyClass3 cmc = new CallMyClass3();
        cmc.tryMe();
    }
}

class MyClass1{
    void doit(){
        System.out.println("doit");
    }
}

class MyClass2{
    int x=1;
    MyClass2(int x){
        this.x = x;
    }
    void doit(){
        System.out.println("doit" + x);
    }
}
