package com.yamakun.test;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByStudentId(String studentId);
    List<Student> findByName(String name);
}
