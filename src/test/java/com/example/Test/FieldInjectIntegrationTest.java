package com.example.Test;

import DependencyInjection.ApplicationContextTestInjectType;
import DependencyInjection.ArbitraryDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class , classes = ApplicationContextTestInjectType.class)
public class FieldInjectIntegrationTest {

    @Inject
    private ArbitraryDependency arbitraryDependency;

    @Test
    public void givenInjectAnnotation_WhenOnField_ThenValidDependency(){
        System.out.println(arbitraryDependency.toString());
    }

}
