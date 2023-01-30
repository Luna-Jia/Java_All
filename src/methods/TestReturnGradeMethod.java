package methods;
public class TestReturnGradeMethod {
    public static void main(String[] args) { // main method
        System.out.print("The grade is " + getGrade(78.5)); // The caller invokes this method in lines 4 and 5.
        System.out.print("\nThe grade is " + getGrade(59.5)); // invoke getGrade
    }
// The getGrade method defined in lines 8–19 returns a character grade based on the numeric score value.
    public static char getGrade(double score) { // getGrade method
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }
}
