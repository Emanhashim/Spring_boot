package com.example.spring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {

    private final StudentService studentService;
//we r saying we can instantiate this constructor using @autowire if it allow as or @component, we can inject the dependency
    @Autowired

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


//  the above pricate service class and constructors allow us to acess the service methods n all but it aint work with out dependecy injection, like we add on the abovr

    @GetMapping
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
