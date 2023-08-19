package com.example.Beans.Learner.Lab;

import com.example.Beans.Learner.Lab.Interfaces.Learner;
import com.example.Beans.Learner.Lab.Interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> peeps = new ArrayList<>();
        learners.forEach(peeps::add);
        peeps.forEach(learner -> learner.learn(numberOfHours/peeps.size()));
    }
}
