package com.example.project_leap_25cc002_arockia_sterin._s.services;

import com.example.project_leap_25cc002_arockia_sterin._s.model.Student;

import java.util.List;

public interface WebService {
    Student saveStudent(Student student);
    void deleteStudent(Long student);
    List<Student> readStudents();
    Student updateStudent(Student student);
}
