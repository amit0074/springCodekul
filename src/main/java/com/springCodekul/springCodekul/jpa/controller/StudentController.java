package com.springCodekul.springCodekul.jpa.controller;

import com.springCodekul.springCodekul.jpa.entity.Student;
import com.springCodekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){

        studentRepository.save(student);
        return "student saved...";

    }

    @GetMapping("getStudent")
    public List<Student> getStudent(){

        return studentRepository.findAll();
    }

}
