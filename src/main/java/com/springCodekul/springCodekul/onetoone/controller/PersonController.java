package com.springCodekul.springCodekul.onetoone.controller;

import com.springCodekul.springCodekul.onetoone.entity.Aadhar;
import com.springCodekul.springCodekul.onetoone.entity.Person;
import com.springCodekul.springCodekul.onetoone.repository.AadharRepository;
import com.springCodekul.springCodekul.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;

//    @PostMapping("savePerson")
//    public String savePerson(@RequestBody Person person){
//        personRepository.save(person);
//        return "Person saved..";
//    }
@PostMapping("savePerson")
    public String savePerson(@RequestBody Person person){
//        Person person1=new Person();
//        person1.setName("Ramuu");
//        person1.setAge(25);
//
//        Aadhar aadhar=new Aadhar();
//        aadhar.setAadharNo(242554154L);
//
//        person1.setAadhar(aadhar);
//        aadhar.setPerson(person);

        personRepository.save(person);
//        aadharRepository.save(aadhar);

        return "Person and aadhar saved..";

    }

}
