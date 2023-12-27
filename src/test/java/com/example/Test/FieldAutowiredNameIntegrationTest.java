package com.example.Test;

import DependencyInjection.ApplicationContextTestAutowiredName;
import DependencyInjection.ArbitraryDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class, classes= ApplicationContextTestAutowiredName.class)
public class FieldAutowiredNameIntegrationTest {

    @Autowired
    private ArbitraryDependency Arbitrary;

    @Test
    public void givenAutowired_WhenSetOnField_ThenDependencyResolved(){
        System.out.println(Arbitrary.toString());
    }
}