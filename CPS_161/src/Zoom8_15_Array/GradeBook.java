package Zoom8_15_Array;

import java.util.Scanner;

public class GradeBook {

    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook();
        gradeBook.displayGradeBook();

    }

    double[][] grades;
    double[] studentAverage;
    double[] quizAverage;
    String[] studentName;
    int numbOfStdn;
    int numbOfQuiz;
    public static Scanner kbInput = new Scanner(System.in);
    public GradeBook(){
        numbOfStdn = 4;
        numbOfQuiz = 3;
        grades = new double[numbOfStdn][numbOfQuiz];
        studentAverage = new double[numbOfStdn];
        quizAverage = new double[numbOfQuiz];
        studentName = new String[numbOfStdn];
        fillGrades();
        fillStudentAverage();

    }
    public void fillGrades(){
        for (int i = 0; i < grades.length; i++){
            System.out.println("enter the student name:");
            studentName[i] = kbInput.nextLine();
            for (int j = 0; j < grades[i].length; j++){
                System.out.println("Enter grade for quiz " + (j + 1));
                grades[i][j] = kbInput.nextDouble();
            }
            kbInput.nextLine();
        }
    }
    public void displayGradeBook(){
        for (int i = 0; i<grades.length; i++){
            System.out.print(studentName[i] + " " + studentAverage[i]+ " ");
            for (int j=0; j<grades[i].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<quizAverage.length; i++){
            System.out.print(quizAverage[i] + " ");
        }
    }

    public void fillStudentAverage() {
        double sum;
        double average = 0;
        for (int i = 0; i < numbOfStdn; i++) {
            sum = 0;
            for (int j = 0; i < numbOfStdn; i++) {
                sum = 0;
                for (j = 0; j < numbOfQuiz; j++) {
                    sum = sum + grades[i][j];
                }
                average = sum / numbOfQuiz;
                studentAverage[i] = average;
            }
        }


    }
}
