package com.company;

public class Main {

    public static void main(String[] args) {

        area(10);
        area(20,10);

    }

    public static double area (double radius) {
        if (radius <= 0) {
            System.out.println("-1");
            return -1;
        }

        double area = radius * radius * Math.PI;
        System.out.println(area);
        return area;
    }

    public static double area (double x, double y) {
        if ((x<=0) || (y<=0) ||((x<=0) && (y<=0))) {
            System.out.println("-1");
            return -1;
        }

        double area = x * y;
        System.out.println(area);
        return area;
    }


}
