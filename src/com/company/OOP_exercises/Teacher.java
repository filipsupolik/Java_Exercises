package com.company.OOP_exercises;

public class Teacher {
    float salary;
    int bonus;

    public Teacher(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public String getInfo() {
        return "Teacher`s salary is " + this.salary + " and binus is " + this.bonus;
    }
}
