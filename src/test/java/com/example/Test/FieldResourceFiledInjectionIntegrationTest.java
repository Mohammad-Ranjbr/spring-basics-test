package com.example.Test;

import DependencyInjection.ApplicationContextTestResourceNameType;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class , classes = ApplicationContextTestResourceNameType.class)
public class FieldResourceFiledInjectionIntegrationTest {

    @Resource // Filed injection with match by type
    //@Resource(name="namedFile") // Filed injection with match by name
    private File defaultFile;

    @Test
    public void givenResourceAnnotation_WhenOnField_ThenDependencyValid(){
        System.out.println(defaultFile.getName());
    }

}
