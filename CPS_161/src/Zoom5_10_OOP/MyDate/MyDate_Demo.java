package Zoom5_10_OOP.MyDate;

import Zoom5_10_OOP.MyDate.MyDate;

public class MyDate_Demo {

    public static void main(String[] args){

        MyDate myDate = new MyDate();                                 //Calling default constructor
        MyDate yourDate= new MyDate(2019,"May", 5);
        MyDate theirDate = new MyDate(2019,"May", 5);

        myDate.printDate();
        System.out.println("yourDate:");
        // yourDate.printDate();
        System.out.println(yourDate);
        System.out.println("theirDate:");
        //theirDate.printDate();
        System.out.println(theirDate);

        System.out.println(yourDate.equals(theirDate));                       //return false, even they have same value.
                                                                       // == can only compare primitive type.
                                                                        // String is not primitive type, but reference type.
                                                                        // Compare string with equals
                                                                        // yourDate is the reference type we defined, so

        System.out.println("myDate is: " + myDate); // toString convert an object to string,so you can print it out and see info


        System.out.println(myDate.getYear());                         // for public instance variables, everyone can see and update them, not secure.

        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());

        myDate.setYear(2019);
        myDate.setDay(40);
        myDate.setMonth("Nov");
        System.out.println("After update: ");
        myDate.printDate();


    }
}
