package com.example.Beans.Learner.Lab.Config;

import com.example.Beans.Learner.Lab.Instructor;
import com.example.Beans.Learner.Lab.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        return new Instructors(new Instructor(5L, "Minsoo"));
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        return new Instructors(new Instructor(6L, "Dima"));
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors getInstructors(){
        return new Instructors(new Instructor(1L, "Kris"),
                new Instructor(9L, "Dolio"));
    }
}
