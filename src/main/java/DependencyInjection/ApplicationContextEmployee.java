package DependencyInjection;

import domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationContextEmployee {

    @Bean
    @Primary
    public Employee mohammadEmployee(){
        return new Employee("Mohammad");
    }

    @Bean
    public Employee hosseinEmployee(){
        return new Employee("Hossein");
    }

}
