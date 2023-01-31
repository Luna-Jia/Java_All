package Zoom4_89Loops;

public class LoopExerciseFinal {

    // loop 20次，0-100， random number, Max, Minim, average

    public static void main(String[] args){

        int rand;
        int sum = 0;
        int maxNumb = Integer.MIN_VALUE;
        int minNumb = Integer.MAX_VALUE;

        for (int i = 0; i<20; i++) {

            rand = (int)(Math.random()*101);
           //System.out.print("i is: " + i + "rand is: " + rand);
            System.out.print(rand + " ");
            if (i%5==4){
                System.out.println();
            }
            sum+=rand;
            if (rand > maxNumb) {
                maxNumb = rand;
            }
            if (rand < minNumb){
                minNumb = rand;
            }
        }

        System.out.println("average is: " + sum/20.0);
        System.out.println("max: " + maxNumb);
        System.out.println("min: " + minNumb);
    }

}
