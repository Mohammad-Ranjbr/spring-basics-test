package com.example.Test;

import config.Config;
import domain.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Company company = applicationContext.getBean("companyy", Company.class);
		System.out.println(company.getAddress().getName()+"	"+company.getAddress().getNumber());

	}

}
