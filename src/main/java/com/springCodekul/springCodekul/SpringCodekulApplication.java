package com.springCodekul.springCodekul;

import com.springCodekul.springCodekul.aop.BoysStudent;
import com.springCodekul.springCodekul.aop.GirlsStudent;
import com.springCodekul.springCodekul.di.Company;
import com.springCodekul.springCodekul.ioc.Jio;
import com.springCodekul.springCodekul.ioc.Vodafone;
//import com.springCodekul.springCodekul.jpa.entity.Student;
//import com.springCodekul.springCodekul.jpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringCodekulApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringCodekulApplication.class, args);

		Vodafone obj=context.getBean(Vodafone.class);
		obj.calling();

		Jio obj2=context.getBean(Jio.class);
		obj2.msg();

		Company company=context.getBean(Company.class);
		company.display();

		BoysStudent boysStudent=context.getBean(BoysStudent.class);
		GirlsStudent girlsStudent=context.getBean(GirlsStudent.class);

		boysStudent.boysStudy();


	}

	@GetMapping("hii")
	public String hellomsg(){
		return "Hello Amit hiii";

	}



}
