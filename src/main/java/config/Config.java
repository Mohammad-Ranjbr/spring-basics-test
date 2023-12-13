package config;

import domain.Address;
import domain.Company;
import domain.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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

}
