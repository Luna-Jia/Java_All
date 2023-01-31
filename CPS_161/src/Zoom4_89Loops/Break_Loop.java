package Zoom4_89Loops;

public class Break_Loop {
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            System.out.println(i);
            if (i==4){
                break;
            }
            System.out.println("ready for next iteration");
        }
        System.out.println("out of the loop");
    }
}
