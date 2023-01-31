package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(4,18,19));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        int big= goal/5;
        int small= goal%5;
        if (bigCount<0|| smallCount<0||goal<0){
            return false;
        } else if (bigCount*5>goal && smallCount==0) {
            return false;
        }else if (bigCount*5+smallCount>=goal && bigCount*5<=goal) {
            return true;
        }else if(bigCount!=0 && goal==5) {
            return true;
        }else if (bigCount>=big && smallCount>=small) {
            return true;
        }
        return false;
    }
}
