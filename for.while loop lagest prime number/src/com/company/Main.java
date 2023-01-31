package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(20));
    }
    public static int getLargestPrime (int number) {

      if (number<2) {
          return -1;
      }

      int count =0;
      for (int i=2;i<=number;i++) {
          while (number%i==0) {
              number/=i;
              count=i;
          }
      } return count;
    }
}
