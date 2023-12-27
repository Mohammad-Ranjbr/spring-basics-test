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
public class MethodByTypeResourceIntegrationTest {

    private File defaultFile;

    @Resource
    public void setDefaultFile(File defaultFile){
        this.defaultFile = defaultFile ;
    }

    @Test
    public void givenResourceAnnotation_WhenSetter_ThenValidDependency(){
        System.out.println(defaultFile.getName());
    }
}
