package com.example.Test;

import config.Config;
import domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeScopeTest {

    private static final String name = "Mohammad Ranjbar";

    @Test
    public void test(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Person personPrototypeA = applicationContext.getBean("person2", Person.class);
        Person personPrototypeB = (Person) applicationContext.getBean("person2");

        personPrototypeA.setName(name);

        System.out.println(personPrototypeA.getName());
        System.out.println(personPrototypeB.getName());

    }

}
