package com.springCodekul.springCodekul.manytomany.repository;

import com.springCodekul.springCodekul.manytomany.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Integer> {
}
