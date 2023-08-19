package com.example.Beans.Learner.Lab.Interfaces;

import com.example.Beans.Learner.Lab.Interfaces.Learner;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
