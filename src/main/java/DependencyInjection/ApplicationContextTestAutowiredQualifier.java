package DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestAutowiredQualifier {

    @Bean("A")
    public ArbitraryDependency autowiredFieldDependency() {
        return new ArbitraryDependency();
    }

    @Bean("B")
    public ArbitraryDependency anotherAutowiredFieldDependency() {
        return new AnotherArbitraryDependency();
    }

}
