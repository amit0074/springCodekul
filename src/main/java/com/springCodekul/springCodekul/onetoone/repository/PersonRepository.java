package com.springCodekul.springCodekul.onetoone.repository;

import com.springCodekul.springCodekul.onetoone.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
