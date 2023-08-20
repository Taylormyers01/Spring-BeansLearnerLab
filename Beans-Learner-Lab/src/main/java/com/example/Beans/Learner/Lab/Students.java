package com.example.Beans.Learner.Lab;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends com.example.SpringBeansLearnerLab.models.People<Student> {
    public Students(){
        super();
    }

    public Students(Student... students){
        super(students);
    }
}
