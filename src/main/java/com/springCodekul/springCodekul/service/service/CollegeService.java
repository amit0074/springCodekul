package com.springCodekul.springCodekul.service.service;

import com.springCodekul.springCodekul.service.entity.College;
import com.springCodekul.springCodekul.service.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface CollegeService {


    String saveCollege(College college);
}
