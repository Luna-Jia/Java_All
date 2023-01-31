package date_array;
/*
Instance variables for month, day and year
• Constructor: MyDate(String month, int day, int year) - the code stores the values in 3
instance variables
• String toString() method - returns a String containing your 3 instance variables.
 */
public class MyDate {

    private int year;
    private String month;
    private int day;

    public MyDate(String month, int day,int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return (month + " " + day + ", " + year);
    }
}
