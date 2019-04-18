package com.baris.spring.rest;

import com.baris.spring.model.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentRestController {


    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("birinci", "birinci"));
        students.add(new Student("2", "2"));
        students.add(new Student("3", "3"));
        students.add(new Student("4", "4"));
        students.add(new Student("5", "5"));
        students.add(new Student("6", "6"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
