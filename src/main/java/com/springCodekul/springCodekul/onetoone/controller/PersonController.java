package com.springCodekul.springCodekul.onetoone.controller;

import com.springCodekul.springCodekul.onetoone.entity.Person;
import com.springCodekul.springCodekul.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person){
        personRepository.save(person);
        return "Person saved..";
    }

}
