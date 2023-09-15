package com.kibernumacademy.devops.repositories;

import com.kibernumacademy.devops.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student,Long> {
}
