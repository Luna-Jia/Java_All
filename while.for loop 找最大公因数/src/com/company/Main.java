package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,30));
    }

    public static int getGreatestCommonDivisor (int first,int second){
        if (first<10 || second <10) {
            return -1;
        } else if (first==second) {
            return first;

        } else if (first>second) {
            for (int i=second; i>=1;i--){
                if (first%i==0 && second % i ==0) {
                    return i;
                }
            }
        } else if (second>first) {
            for (int i=first;i>=1;i--){
                if (first%i==0 && second % i ==0){
                    return i;
                }
            }

        }
        return -1;
    }
}
