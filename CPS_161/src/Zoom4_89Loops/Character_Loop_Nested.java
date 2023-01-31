package Zoom4_89Loops;

public class Character_Loop_Nested {

    public static void main(String[] args){

        for (char ch1 ='a'; ch1<='z'; ch1++){
            for (char ch2 ='a'; ch2<='z'; ch2++){
                System.out.print(ch1);
                System.out.print(ch2 + " ");
            }
            System.out.println();
        }
    }
}
