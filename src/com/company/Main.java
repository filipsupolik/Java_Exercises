package com.company;

import com.company.OOP_exercises.Programmer;
import com.company.OOP_exercises.Student;
import com.company.OOP_exercises.Teacher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("John", 1, 123456, "Na Rybnik 19, 01301 Teplicka n/V");
        Student student1 = new Student("Sam", 2, 123456, "Na Rybnik 19, 01301 Teplicka n/V");
        Programmer programmer = new Programmer(3000, 1000);
        Teacher teacher = new Teacher(3000, 1000);
        System.out.println(totalDistance(0.1, 0.5, 300.0));
        System.out.println(equal(5, 3, 5));
        System.out.println(triangle(4, 3, 8));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{2,3,4,5,10})));
        System.out.println(equalSlices(11,5,2));
        System.out.println(checkPalindrome("mom"));
        System.out.println(rps("rock", "paper"));
        System.out.println(differenceMaxMin(new int[]{2,5,-10,56,17,-125,25,56}));
        System.out.println(student.getName() + " " + student.getStudentNumber() + " " + student.getPhoneNumber() + student.getAddress());
        System.out.println(student1.getName() + " " + student1.getStudentNumber() + " " + student1.getPhoneNumber() + student1.getAddress());
        System.out.println(programmer.getInfo());
        System.out.println(teacher.getInfo());
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
        return sliceEach * numberOfRecipients <= totalSlices;
    }

    //Palindrome
    public static boolean checkPalindrome(String palindrome) {
        StringBuilder reverseWord = new StringBuilder(palindrome);
        String word1 = reverseWord.reverse().toString();
        return palindrome.equals(word1);
    }

    //Rock, paper, scissor
    public static String rps(String player1, String player2) {
        if (player1.equals(player2)) return "TIE";
        switch (player1){
            case "rock":
                if (player2.equals("paper"))
                    return "Player 2 wins";
                break;
            case "paper":
                if (player2.equals("scissors"))
                    return "Player 2 wins";
                break;
            case "scissors":
                if (player2.equals("rock"))
                    return "Player 2 wins";
                break;
        }
        return "Player 1 wins";
    }

    //Difference between min and max num in Array
    public static int differenceMaxMin(int[] numbers) {
            int max = numbers[0];
            int min = numbers[0];
            for (var index = 1; index < numbers.length; index++) {
                if (max < numbers[index]) max = numbers[index];
                if (min > numbers[index]) min = numbers[index];
            }
            return max - min;
        }

}
