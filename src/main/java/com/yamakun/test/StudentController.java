package com.yamakun.test;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student newStudent) {
        if (repository.findByStudentId(newStudent.getStudentId()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Student ID already exists");
        }
        return repository.save(newStudent);
    }

    @GetMapping("/{studentId}")
    public Student getStudentByStudentId(@PathVariable String studentId) {
        return repository.findByStudentId(studentId);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello world";
    }
    
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
