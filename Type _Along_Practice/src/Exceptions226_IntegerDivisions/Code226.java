package Exceptions226_IntegerDivisions;

public class Code226 {

    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        System.out.println(divideEAFP(x,y));

    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
