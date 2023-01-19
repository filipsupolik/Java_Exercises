package com.company.OOP_exercises;

public class Programmer {
    float salary;
    int bonus;

    public Programmer(float salary, int bonus) {
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
        return "Programmer`s salary is " + this.salary + " and binus is " + this.bonus;
    }
}
