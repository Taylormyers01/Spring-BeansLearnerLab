package com.example.Beans.Learner.Lab;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends com.example.SpringBeansLearnerLab.models.People<Instructor> {
    public Instructors() {
        super();
    }

    public Instructors(Instructor... instructors){
        super(instructors);
    }

}
