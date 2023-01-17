package com.springCodekul.springCodekul.jpa.controller;

import com.springCodekul.springCodekul.jpa.entity.Student;
import com.springCodekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")

    public String saveStudent(@RequestBody Student student){
        Student student1= new Student();
        student1.setNumber(student.getNumber());
        student1.setName(student.getName());
         student1.setDob(student.getDob());
         student1.setAddress(student.getAddress());
        Period period=Period.between(student.getDob(),LocalDate.now());
        int age=period.getYears();
        student1.setAge(age);

        studentRepository.save(student1);
        return "student saved...";

    }

    @GetMapping("getStudent")
    public List<Student> getStudent(){

        return studentRepository.findAll();
    }
    @GetMapping("getById/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentRepository.findById(id);
    }


@PutMapping("update")
public String updateStudent(@RequestBody Student student){
    Student student1= studentRepository.getReferenceById(student.getId());
    student1.setAddress(student.getAddress());
    student1.setName(student.getName());
    student1.setNumber(student.getNumber());

    studentRepository.save(student1);
    return "record Updated";
}
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
        return "record deleted";
    }
    @DeleteMapping("deleteByIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "records deleted";

    }

    @GetMapping("getByAddress/{address}/{name}")
    public List<Student> getByAddress(@PathVariable ("address") String address,@PathVariable ("name") String name)
    {

        return studentRepository.findByAddressOrName( address, name);
    }

    @GetMapping("getByName/{name}")
    public List<Student> getByName(@PathVariable ("name" )String name){
        return studentRepository.findByNameEquals(name);
    }

    @GetMapping("getByDate/{startDate}/{endDate}")
    public List<Student> getByDate(@PathVariable ("startDate") LocalDate startDate,@PathVariable("endDate") LocalDate endDate){
        return studentRepository.findBydobBetween(startDate, endDate);
    }
    @GetMapping("getStudentDobAfter/{startDate}")
    public List<Student> getStudentDobAfter(@PathVariable ("startDate") LocalDate startDate){
        return studentRepository.findByDobAfter(startDate);
    }

    @GetMapping("getStudentAge/{Age}")
    public List<Student> getStudentAge(@PathVariable ("Age") Integer Age){
        return studentRepository.findByAgeGreaterThan(Age);
    }
    @GetMapping("getStudentLessAge/{Age}")
    public List<Student> getStudentLessAge(@PathVariable ("Age") Integer Age){
        return studentRepository.findByAgeLessThan(Age);
    }
    @GetMapping("getStudentGreaterAge/{Age}")
    public List<Student> getStudentGreaterAge(@PathVariable ("Age") Integer Age){
        return studentRepository.findByAgeGreaterThan(Age);
    }







}
