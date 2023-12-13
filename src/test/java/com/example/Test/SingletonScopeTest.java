package com.example.Test;

import config.Config;
import domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonScopeTest {

    private static final String name = "mohammad ranjbar";

    @Test
    public void test(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Person personSingletonA = applicationContext.getBean("person", Person.class);
        Person personSingletonB = (Person) applicationContext.getBean("person");

        personSingletonA.setName(name);
        System.out.println(personSingletonA.getName());
        System.out.println(personSingletonB.getName());

    }

}
