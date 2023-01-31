package com.company;

public class Main {

    public static void main(String[] args) {
	printEqual(-1,1,1);
    }

    public static void printEqual (int x, int y, int z) {

        if ((x<0) || (y<0) || (z<0)) {
            System.out.println("Invalid Value");
        }

        if ((x==z) && (y==z) && (x>=0)) {
            System.out.println("All numbers are equal");
        }

        if ((x!=z) && (y!=z) && (x!=y)) {
            System.out.println("All numbers are different");
        }

        if (((x==y) && (y!=z) && (x>=0) && (z>=0)) || ((y==z) && (x!=z) && (y>=0) && (x>=0)) || ((x==z) && (y!=z) && (x>=0 && (y>=0)))) {
            System.out.println("Neither all are equal or different");
        }
    }
}
