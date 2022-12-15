package com.springCodekul.springCodekul.ioc;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {
    @Bean
    public Vodafone getobj(){
        return new Vodafone();
    }
    @Bean
    public Jio getobj2(){
        return new Jio();
    }



}
