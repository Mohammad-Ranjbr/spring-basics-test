package com.example.Test;

import DependencyInjection.ApplicationContextTestResourceQualifier;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class , classes = ApplicationContextTestResourceQualifier.class)
public class QualifierResourceFiledInjectionIntegrationTest {

    @Resource
    @Qualifier("defaultFile")
    private File dependency1;

    @Resource
    @Qualifier("namedFile")
    private File dependency2;

    @Test
    public void givenResourceAnnotation_WhenField_ThenDependency1Valid(){
        System.out.println(dependency1.getName());
    }

    @Test
    public void givenResourceQualifier_WhenField_ThenDependency2Valid(){
        System.out.println(dependency2.getName());
    }


}
