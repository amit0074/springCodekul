package com.springCodekul.springCodekul.validation;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message= "name can not be null")
    @Column(length = 100)
    private String countryName;

    @NotNull(message = "countryCode can not be null")

    private String countryCode;

    @Email(message = "Invalid format")
    private String email;


    @NotNull(message = "population can not be null")
    @Max(value = 124546556321456L)
    @Min(value = 2000)
    private String population;


}
