package methods;
import java.util.Scanner;
public class PrintCalendar {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Step 1 (Line 5-14)：ask user input.
        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month); // Step 3: call printMonth method.
    }

    // Print the calendar for a month in a year
    public static void printMonth(int year, int month) { // Step 2（line 21): Create printMonth method.
        // Print the headings of the calendar
        printMonthTitle(year,month); // Step 6

        // Print the body of the calendar
        printMonthBody(year, month); // Step 8
    }

    // Print the month title, e.g., March 2012
    public static void printMonthTitle(int year, int month) { // Step 4 (line 30): Create printMonthTitle method
        System.out.println("         " + getMonthName(month) + " " + year); // Step 12 (Line 31-34): fill in details

        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // Get the English name for the month
    public static String getMonthName(int month) { // Step 5 (line 38): create getMonthName method。把月份从数字化成单词
        String monthName = ""; // Step 19 (line 39 - 56)
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

    // Print month body
    public static void printMonthBody(int year, int month) { // Step 7 (line 59): Create printMonthBody method
        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year,month); // Step 13: 需要知道此月是从星期几开始的

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month); // Step 14: 需要知道此月总共有几天

        // Pad space before the first day of the month // Step 15 (line 67-69)
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    "); // 4个空格

        for (i = 1; i <= numberOfDaysInMonth; i++ ) { // Step 16 (line 71-79)： 输出day1- day31/30/29/28
            System.out.printf("%4d", i); // Step 17 (line 72):每个日期day（int）占4个格，默认右对齐

            if ((i + startDay) % 7 == 0) // Step 18 (line 74-75):  判断是否换行
                System.out.println();
        }

        System.out.println();
    }

    // Get the start day of month /1/year
    public static int getStartDay(int year, int month) { // Step 9。 月份从周几开始？
        final int START_DAY_FOR_JAN_1_1800 = 3; // Step 20 (line 83)
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month); // Step 22

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    // Get the total number of days since January 1, 1800
    public static int getTotalNumberOfDays(int year, int month) { // Step 21
        int total = 0; // Step 23

        // Get the total days from 1800 to 1/1/year
        for (int i = 1000; i < year; i++) // Step 24 (line 96 - 100).i表示year（1000年）
            if (isLeapYear(i))
                total += + 366; // 求和
            else
                total = total + 365;

            // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++) // Step 25
            total = total + getNumberOfDaysInMonth(year, i); // i 表示 month

        return total;
    }

    // Get the number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) { // Step 10: 一个月有几天？（此method return某个月的天数。）
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) // Step 27 (line 111 - 121)
            return 31;


        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year)? 29:28;

        return 0; // If month is incorrect
    }

    // Determine if it is a leap year
    public static boolean isLeapYear(int year) { // Step 11: 是闰年吗？
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); // Step 26
    }
}






















