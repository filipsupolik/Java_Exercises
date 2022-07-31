package com.company;

public class Exercises {
    public static double totalDistance(double stepHeight, double stepLength, double towerHeight) {
       var numberOfSteps = towerHeight/stepHeight;
       return numberOfSteps * (stepHeight + stepLength);
    }
}
