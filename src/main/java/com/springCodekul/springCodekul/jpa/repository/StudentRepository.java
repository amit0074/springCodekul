package com.springCodekul.springCodekul.jpa.repository;

import com.springCodekul.springCodekul.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
