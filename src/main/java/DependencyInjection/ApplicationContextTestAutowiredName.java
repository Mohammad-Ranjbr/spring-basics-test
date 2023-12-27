package DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = AnotherArbitraryDependency.class)
public class ApplicationContextTestAutowiredName {

    @Bean("Arbitrary")
    public ArbitraryDependency getArbitraryDependency(){
        return new ArbitraryDependency();
    }

}