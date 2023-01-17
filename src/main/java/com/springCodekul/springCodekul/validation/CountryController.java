package com.springCodekul.springCodekul.validation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryRepo countryRepo;

    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody @Valid Country country){
        countryRepo.save(country);
                return "Country Saved...";
    }

}
