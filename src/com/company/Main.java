package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(totalDistance(0.1, 0.5, 300.0));
        System.out.println(equal(5, 3, 5));
        System.out.println(triangle(4, 3, 8));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{2,3,4,5,10})));
        System.out.println(equalSlices(11,5,2));

    }
    //Snail exercise
    public static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
        var numberOfSteps = towerHeight/stepHeight;
        return numberOfSteps * (stepHeight + stepLength);
    }

    //Equality exercise
    public static int equal(int a, int b, int c) {
        if (a == b || a == c) {
            if (b == c) return 3;
            return 2;
        }
        if(b == c) return 2;
        return 0;
    }

    //Triangle exercise
    public static boolean triangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    //Array exercise
    public static int[] multiplyByLength(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= a.length;
        }
        return a;
    }

    //Slices exercise
    public static boolean equalSlices(int totalSlices, int numberOfRecipients, int sliceEach) {
        int slices = numberOfRecipients * sliceEach;
        return sliceEach <= totalSlices;
    }
}
