package com.shashank.studentapp.controller;

import com.shashank.studentapp.model.Student;
import com.shashank.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student s){
        return studentService.addStudent(s);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") long id){
        return studentService.getStudent(id);
    }


}
