package Module2_Scanner;

import java.util.Scanner;

public class KobeStats {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        String season;
        double fieldGoals;
        double fieldGoalAttempts;
        double fgPercent;

        System.out.println("please enter the season:");
        season = kbInput.nextLine();
        System.out.println("please enter the field goals:");
        fieldGoals = kbInput.nextDouble();
        System.out.println("please enter the field goal attempts:");
        fieldGoalAttempts=kbInput.nextDouble();
        fgPercent= fieldGoals/fieldGoalAttempts*100;
        //System.out.println(fgPercent);

        System.out.println("for season " + season);
        System.out.printf("field goals: %6.2f\n", fieldGoals);
        System.out.printf("field goal attempts: %6.2f\n",fieldGoalAttempts);

        System.out.printf("field goal percentage: %6.2f%%\n",fgPercent);

    }
}
