package ramdom;

public class ForLoop3 {
    public static void main(String[] args){
        for (int I = 1; I <5; I++){
            switch (I%3){
                default:
                    System.out.println("pear ");
                    break;
                case 2:
                    System.out.println("orange ");
                    break;
                case 1:
                    System.out.println("apple ");
                    break;
            }
        }
    }
}
