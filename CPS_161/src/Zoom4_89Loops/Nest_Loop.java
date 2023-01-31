package Zoom4_89Loops;

public class Nest_Loop {
    public static void main(String[] args){

         for (int i=0; i<5; i++ ){       // will loop 5 times    // outer loop
            for (int j=0; j<5; j++){                            // inner loop
                System.out.println("i is: " + i);
                System.out.println("j is: " + j);
            }

        }

        for (int i=0; i<10; i++ ){
            System.out.print(" i is: " +i + " j is: ");
            for (int j=0; j<10; j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}

// outer loop 每转一次，inner loop 转5次。