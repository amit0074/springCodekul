package com.springCodekul.springCodekul.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @Before("execution(public void boysStudy())")
    public void wakeUp(){
        System.out.println("Wake Up");
    }
}
