package Zoom5_10_OOP;

public class PrintGrade_MethodExercise2 {

    public static void printGrade(int grade){                        //顺序matters.
        if (grade>=90) {
            System.out.println("You grade is A.");
        }else if (grade >=80){
            System.out.println("You grade is B.");
        }else if (grade>=70) {
            System.out.println("You grade is C.");
        }else if (60<=grade){
                System.out.println("You grade is D.");
        }else{
            System.out.println("Your grade is F.");
        }
    }

    public static void main(String[] args){
        printGrade(98);

    }
}
