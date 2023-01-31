package com.company;

public class Main {
    public static void main(String[] args) {
        Main.wa(6000);
    }

    public static void wa(int kiloBytes) {
            if (kiloBytes<0){
                System.out.println("Invalid Value");
            } else if (kiloBytes>=1024){
            int calMb = Math.round(kiloBytes/1024);
            int calKb = kiloBytes-calMb*1024;
            System.out.println(kiloBytes +" KB = " + calMb + " MB and " + calKb + " KB");

        } else if (kiloBytes>=0 && kiloBytes< 1024){
                System.out.println(kiloBytes +" KB = " +"0 MB " + kiloBytes+" KB" );
            }
    }
}
