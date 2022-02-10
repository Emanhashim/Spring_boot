package com.example.spring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
//we mean that this class scan bce instantiated from other class who has dependency injection @Autowire only
//we can name it @component or @service , but for semantic i used @service

public class StudentService {

    public List<Student> getStudent() {
        return List.of(new Student(
                1L,
                "eman",
                "eman@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5 ),
                21
        ));
    }


}
