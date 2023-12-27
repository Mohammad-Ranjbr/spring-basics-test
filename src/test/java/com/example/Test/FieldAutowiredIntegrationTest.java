package com.example.Test;

import DependencyInjection.ApplicationContextTestAutowiredType;
import DependencyInjection.ArbitraryDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class, classes= ApplicationContextTestAutowiredType.class)
public class FieldAutowiredIntegrationTest {

    @Autowired
    private ArbitraryDependency arbitraryDependency;

    @Test
    public void givenAutowired_WhenSetOnField_ThenDependencyResolved(){
        System.out.println(arbitraryDependency.toString());
    }

}
