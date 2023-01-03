package com.springCodekul.springCodekul.service.service;


import com.springCodekul.springCodekul.service.entity.College;
import com.springCodekul.springCodekul.service.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeImpl implements CollegeService{


    @Autowired
    private CollegeRepository collegeRepository;


    @Override
    public String saveCollege(College college){
        collegeRepository.save(college);
        return "College saved...";
    }
}
