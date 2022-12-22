package com.springCodekul.springCodekul.onetoone.controller;

import com.springCodekul.springCodekul.onetoone.entity.Aadhar;
import com.springCodekul.springCodekul.onetoone.repository.AadharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AadharController {


    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("saveAadhar")
    public String saveAadhar(@RequestBody Aadhar aadhar){
        aadharRepository.save(aadhar);
        return "Aadhar Saved...";

    }
}
