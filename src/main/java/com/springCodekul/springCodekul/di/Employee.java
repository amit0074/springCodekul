package com.springCodekul.springCodekul.di;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_SINGLETON)
public class Employee {

    public void show(){
        System.out.println("In employee show");
    }

    public Employee(){
        System.out.println("Employee Constructor");
    }



}
