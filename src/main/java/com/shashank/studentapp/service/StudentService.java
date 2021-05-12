package com.shashank.studentapp.service;

import com.shashank.studentapp.model.Student;
import com.shashank.studentapp.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public Student addStudent(Student s) {
        return repo.save(s);
    }

    public Student getStudent(long id) {
        return repo.findStudentById(id);
    }
}
