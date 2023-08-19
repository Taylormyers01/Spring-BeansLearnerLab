package com.example.Beans.Learner.Lab.Config;

import com.example.Beans.Learner.Lab.Classroom;
import com.example.Beans.Learner.Lab.Instructors;
import com.example.Beans.Learner.Lab.Students;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }
}
