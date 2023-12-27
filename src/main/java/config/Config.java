package config;

import domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.context.WebApplicationContext;

@Configuration
//@ComponentScan(basePackageClasses = Company.class)
//@ComponentScan(basePackages = "domain") // Repeating Annotation
@ComponentScans({
        @ComponentScan(basePackageClasses = Company.class),
        @ComponentScan(basePackages = "domain")
})
public class Config {

    @Bean
    public Address getAddress(){
        return new Address("High Street", 1000);
    }

    @Bean
    //@Scope("singleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person getPerson(){
        return new Person();
    }

    @Bean(name = "person2")
    @Scope("prototype")
    //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person personPrototype() {
        return new Person();
    }

    @Bean(name = "helloMessageGenerator1")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST , proxyMode = ScopedProxyMode.TARGET_CLASS) //instead
    //@RequestScope
    public HelloMessageGenerator getHelloMessageGenerator(){
        HelloMessageGenerator helloMessageGenerator = new HelloMessageGenerator();
        helloMessageGenerator.setMessage("Hi mamad");
        return helloMessageGenerator;
    }

    @Bean
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(5);
        threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskSchedule");
        return threadPoolTaskScheduler;
    }


}
