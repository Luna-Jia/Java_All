package com.company;


        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

            return num1 == num2 || (int)(num1*1000) == (int)(num2*1000);
        }
}
