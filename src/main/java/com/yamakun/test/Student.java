package com.yamakun.test;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
    @Id
    private String name;
    private String studentId;
    private String academicYear;

    // getters and setters
    public String getStudentId() {
        return studentId;
    }
    public String getAcademicYear() {
        return academicYear;
    }
    public String getName() {
        return name;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
