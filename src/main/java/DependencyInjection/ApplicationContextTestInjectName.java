package DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectName {

    @Bean
    public ArbitraryDependency getYetAnotherFieldInjectDependency(){
        return new YetAnotherArbitraryDependency();
    }

}
