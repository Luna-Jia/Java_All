package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getBucketCount (double width, double height,double areaPerBucket,int extraBuckets) {

        double paintArea = width * height;
        double homePaintArea = areaPerBucket * extraBuckets;
        double leftArea = paintArea - homePaintArea;
        double buyingBuckets = Math.ceil((leftArea /areaPerBucket));


        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;

        } else {

            return (int) buyingBuckets;
        }
    }

    public static int getBucketCount (double width, double height,double areaPerBucket) {

        double paintArea = width * height;
        double buyingBuckets = Math.ceil((paintArea /areaPerBucket));

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;

        } else {

            return (int) buyingBuckets;
        }
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        double buyingBuckets = Math.ceil((area /areaPerBucket));

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;

        } else {

            return (int) buyingBuckets;
        }

    }


}
