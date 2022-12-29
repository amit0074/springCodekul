package com.springCodekul.springCodekul.manytomany.controller;


import com.springCodekul.springCodekul.manytomany.entity.Courses;
import com.springCodekul.springCodekul.manytomany.entity.Students;
import com.springCodekul.springCodekul.manytomany.repository.CoursesRepo;
import com.springCodekul.springCodekul.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CoursesRepo coursesRepo;

    @PostMapping("saveStud")
    public String saveStud(@RequestBody Students students){
        studentRepo.save(students);
        return "Student saved...";
    }


    @PostMapping("saveCourse")
    public String saveCourse(@RequestBody Courses courses){
        coursesRepo.save(courses);
        return "Course saved...";
    }




}
