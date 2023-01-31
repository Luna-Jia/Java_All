package Zoom4_89Loops;

public class Continue_Loop {
    public static void main(String[] args){
        for (int i=0; i<10; i++){

            if (i==4){
                continue;
            }
            System.out.println(i); // try to place this line before and after if statement, compare result.
            System.out.println("ready for next iteration");
        }
        System.out.println("out of the loop");
    }
}
