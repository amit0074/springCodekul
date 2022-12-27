package com.springCodekul.springCodekul.manytomany.repository;

import com.springCodekul.springCodekul.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Integer> {
}
