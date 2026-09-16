package com.example.project_leap_25cc002_arockia_sterin._s.controller;



import com.example.project_leap_25cc002_arockia_sterin._s.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.Location;

@RestController
public class webController {
    @GetMapping("/calculate")
    int calculate(int a, int b, String operation) {
        switch (operation) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;

            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
        }
    }
    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student();
        student.setName("Sterin");
        student.setDepartment("CCE");
        student.setRollNo("12345");
        return student;
    }

    @GetMapping("/location")
    public Location getLocation() {
        Location.setName("Coimbatore");

    }

}

