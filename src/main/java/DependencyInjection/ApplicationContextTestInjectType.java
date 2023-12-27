package DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectType {

    @Bean
    public ArbitraryDependency getArbitraryDependency(){
        return new ArbitraryDependency();
    }

}
