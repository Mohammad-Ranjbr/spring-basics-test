package config;

import domain.Address;
import domain.Company;
import domain.HelloMessageGenerator;
import domain.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
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

}
