public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.foo(1,2);
    }
    private void foo(int a, int b){
        System.out.println("int");
    }
    private void foo (long a, int b){
        System.out.println("long");
    }
}
