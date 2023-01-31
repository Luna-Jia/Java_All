package Zoom5_10_OOP.MyDate;

public class MyDate {                         // each class can only have one public class

    private int year;                                  // under class are instance variable.
    private String month;
    private int day;                                   // under method are local variable.

        // class name
    public MyDate(){                                    // constructor, initialize the value with a more comlexd logic
       year = 2020;                           // default constructor, no value/parameter pass in ()
        month = "Oct";
        day = 13;
    }

    public MyDate(int year,String month,int day){           //un-default constructor
        this.year = year;
        this. month = month;
        //this.day = otherDate.day;
        setDay(day);
    }
    public MyDate(MyDate otherDate){               //deep copy
        this.year = otherDate.year;
        this.month = otherDate.month;
        this.day = otherDate.day;
    }

    public int getYear(){
        return year;
    }

    public String getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public void setDay(int day){
        if (day>=1 && day<=31){
            this.day = day;
        }else {
            System.out.println("invalid data.");
        }
    }

    public boolean equals(MyDate otherDate){
        return year==otherDate.year && month.equals(otherDate.month) && day==otherDate.day;
    }

    public void printDate(){
        System.out.println("Year is: " + year);
        System.out.println("Month is: " + month);
        System.out.println("Day is: " + day);
    }

    public String toString() {
        return month + " " + day + ", " + year;
    }
}
