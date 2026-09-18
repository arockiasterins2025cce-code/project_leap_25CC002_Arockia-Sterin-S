package com.example.project_leap_25cc002_arockia_sterin._s.controller;

import com.example.project_leap_25cc002_arockia_sterin._s.model.Student;
import com.example.project_leap_25cc002_arockia_sterin._s.services.WebService;
import com.example.project_leap_25cc002_arockia_sterin._s.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class WebController {
 @Autowired
 private WebService webService;
 @PostMapping
 public Student addStudent(@RequestBody Student student){
     return webService.saveStudent(student);
  }
}

