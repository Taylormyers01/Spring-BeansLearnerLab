package com.example.Beans.Learner.Lab.Config;

import com.example.Beans.Learner.Lab.Classroom;
import com.example.Beans.Learner.Lab.Instructors;
import com.example.Beans.Learner.Lab.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean("currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("instructors")Instructors instructors,
                                   @Qualifier("students")Students students){
        return new Classroom(instructors, students);
    }

    @Bean("previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors,
                                    @Qualifier("previousStudents") Students students){
        return new Classroom(instructors, students);
    }
}
