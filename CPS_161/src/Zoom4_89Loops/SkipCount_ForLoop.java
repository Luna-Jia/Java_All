package Zoom4_89Loops;

public class SkipCount_ForLoop {
    public static void main(String[] args) {

        // Skip Counting 方法一：
        for (int i=0; i<51; i++){
            System.out.println(i*2);
        }
        // Skip Counting 方法二：
        for (int i=0; i<101; i=i+3) {
            System.out.println(i);
        }
    }
}
