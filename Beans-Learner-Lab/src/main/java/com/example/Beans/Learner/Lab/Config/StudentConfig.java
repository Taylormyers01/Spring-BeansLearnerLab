package com.example.Beans.Learner.Lab.Config;

import com.example.Beans.Learner.Lab.Student;
import com.example.Beans.Learner.Lab.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(null);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return new Students(null);
    }
}
