package com.shashank.studentapp.repo;

import com.shashank.studentapp.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    public Student findStudentById(long id);
}
