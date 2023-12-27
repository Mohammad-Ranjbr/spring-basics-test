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
public class MethodByQualifierResourceSetterIntegrationTest {

    private File arbDependency;
    private File anotherArbDependency;

    @Resource
    @Qualifier("namedFile")
    public void setArbDependency(File arbDependency){
        this.arbDependency = arbDependency;
    }

    @Resource
    @Qualifier("defaultFile")
    public void setAnotherArbDependency(File anotherArbDependency){
        this.anotherArbDependency = anotherArbDependency;
    }

    @Test
    public void givenResourceQualifier_WhenSetter_ThenValidDependencies(){
        System.out.println(arbDependency.getName());
        System.out.println(anotherArbDependency.getName());
    }

}
