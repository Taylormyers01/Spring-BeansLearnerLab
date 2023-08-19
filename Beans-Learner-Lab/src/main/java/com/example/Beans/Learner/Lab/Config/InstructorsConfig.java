package com.example.Beans.Learner.Lab.Config;

import com.example.Beans.Learner.Lab.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructs(){
        return new Instructors(null);
    }

    @Bean
    public Instructors tcUkInstructors(){
        return new Instructors(null);
    }

    @Bean
    @Primary
    public Instructors instructors(){
        return new Instructors(null);
    }

}
