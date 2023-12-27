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
public class MethodResourceSetterInjectionIntegrationTest {

    private File defualtFile;

    @Resource(name = "namedFile")
    public void setDefaultFile(File defualtFile){
        this.defualtFile = defualtFile;
    }

    @Test
    public void givenResourceAnnotation_WhenSetter_ThenDependencyValid(){
        System.out.println(defualtFile.getName());
    }

}
