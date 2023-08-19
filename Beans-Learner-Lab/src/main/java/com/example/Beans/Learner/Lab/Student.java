package com.example.Beans.Learner.Lab;

import com.example.Beans.Learner.Lab.Interfaces.Learner;

public class Student extends Person implements Learner {

    Double totalStudyTime;
    public Student(Long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }



    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+= numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
