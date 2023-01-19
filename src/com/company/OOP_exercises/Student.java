package com.company.OOP_exercises;

public class Student {
    String name;
    int studentNumber;
    int phoneNumber;
    String address;

    public Student(String name, int studentNumber, int phoneNumber, String address) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
