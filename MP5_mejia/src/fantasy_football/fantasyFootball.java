package fantasy_football;

import java.util.Scanner;

public class fantasyFootball {
    private int numbOfTeam;
    private int numbOfWeek;
    private int[][] scores;
    private double[] weekAverage;
    private double[] teamAverage;
    private String[] teamName;

    public static Scanner kbInput = new Scanner(System.in);

    public void enterInData() {

        System.out.println("please enter the number of teams:");
        numbOfTeam = kbInput.nextInt();
        System.out.println("please enter the number of weeks:");
        numbOfWeek = kbInput.nextInt();
        kbInput.nextLine();
        scores = new int[numbOfTeam][numbOfWeek];
        weekAverage = new double[numbOfWeek];
        teamAverage = new double[numbOfTeam];
        teamName = new String[numbOfTeam];

        for (int i=0; i<numbOfTeam; i++){
            System.out.println("please enter a name for the team:");
            teamName[i] = kbInput.nextLine();
            for (int j=0; j<numbOfWeek; j++){
                System.out.println("please enter a score for week " + (j+1));
                scores[i][j] = kbInput.nextInt();
                kbInput.nextLine();
            }
        }

    }

    public void fillTeamAverage() {
        int total;
        for (int i = 0; i < numbOfTeam; i++) {
            total = 0;
            for (int j = 0; j < numbOfWeek; j++) {
                    total = total + scores[i][j];
            }
            teamAverage[i] = total/numbOfWeek;
        }
    }

    public void fillWeekAverage() {
        int total;
        for (int i = 0; i<numbOfWeek; i++){
            total =0;
            for (int j=0; j<numbOfTeam; j++){
                total = scores[j][i];
            }
            weekAverage[i] = total/numbOfTeam;
        }
    }

    public void display(){
        System.out.printf("%20s","team name:");
        for (int i=0; i<numbOfWeek; i++){
            System.out.printf("%18s %d","week", i+1);
        }
        System.out.println();

        for (int i=0; i<numbOfTeam; i++){
            System.out.printf("%20s",teamName[i]);

            for (int j=0; j<numbOfWeek; j++){
                System.out.printf("%20d", scores[i][j]);
            }
            System.out.printf("        Average = %.2f",teamAverage[i]);
            System.out.println();
        }

        System.out.printf("%20s","Weekly Average:");
        for (int i=0; i<numbOfWeek; i++){
            System.out.printf("%20.2f",weekAverage[i]);
        }
    }

    public static void main(String[] args){
        fantasyFootball f = new fantasyFootball();
        f.enterInData();
        f.fillTeamAverage();
        f.fillWeekAverage();
        f.display();
    }
}
