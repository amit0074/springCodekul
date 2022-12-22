package com.springCodekul.springCodekul.jpa.repository;

import com.springCodekul.springCodekul.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = " select distinct address from student;", nativeQuery=true)
    List<String> findDistinctAddress();

    List<Student> findByAddressOrName(String address,String name);


    List<Student> findByNameEquals(String name);

    List<Student> findBydobBetween(LocalDate startDate,LocalDate endDate);

    List<Student> findByDobAfter(LocalDate startDate);

    List<Student> findByAgeGreaterThan(Integer age);

    List<Student> findByAgeLessThan(Integer age);

//    List<Student> findBydobGreaterThan(LocalDate startDate);
}
