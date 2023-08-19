package com.example.Beans.Learner.Lab;

import com.example.Beans.Learner.Lab.Interfaces.Teacher;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students.personList, numberOfHours);
    }
}
