package objectsAndClass;

public class TestD {

    public static void main(String[] args) {

        D d1 = new D();
        D d2 = new D();

        System.out.println("d1's i = " + d1.i + " and j = " + d1.j);
        System.out.println("d2's i = " + d2.i + " and j = " + d2.j);
    }
}

class D {
    static int i = 0; // i为static，不和任何instance/object 相捆绑，此class的所有objects share，更新相同的i。
    int j = 0;

    D() {
        i++; // 每次有新的object建立，i就在0的基础上增加1
        j = 1;
    }
}
