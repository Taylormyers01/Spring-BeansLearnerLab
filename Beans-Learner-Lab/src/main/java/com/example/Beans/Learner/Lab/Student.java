package com.example.Beans.Learner.Lab;

import com.example.Beans.Learner.Lab.Interfaces.Learner;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(Long id, String name) {
        this(id, name, 0);
    }

    public Student(Long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
