package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(totalDistance(0.1, 0.5, 300.0));
        System.out.println(equal(5, 3, 5));
        System.out.println(triangle(4, 3, 8));

    }
    public static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
        var numberOfSteps = towerHeight/stepHeight;
        return numberOfSteps * (stepHeight + stepLength);
    }

    public static int equal(int a, int b, int c) {
        if (a == b || a == c) {
            if (b == c) return 3;
            return 2;
        }
        if(b == c) return 2;
        return 0;
    }

    public static boolean triangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        }
        return false;
    }
}
