package com.example.Test;

import DependencyInjection.ApplicationContextEmployee;
import domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class , classes = ApplicationContextEmployee.class)
public class PrimaryAnnotationTest {

    @Autowired
    private Employee employee;

    @Test
    public void test(){
        System.out.println(employee.getName());
    }

    @Test
    public void test2() throws InterruptedException{
        employee.scheduleFixedDelayTask();
        System.out.println("-----------");
        employee.scheduleFixedRateTask();
        System.out.println("-----------");
        employee.scheduleFixedRateTaskAsync();
        employee.scheduleFixedRateTask();
    }

}
