package DependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectQualifier {

    @Bean//(name = "defaultFile")
    @Qualifier(value = "defaultFile")
    public ArbitraryDependency getArbitraryDependency(){
        return new ArbitraryDependency();
    }

    @Bean//(name = "namedFile")
    @Qualifier(value = "namedFile")
    public ArbitraryDependency getAnotherArbitraryDependency(){
        return new AnotherArbitraryDependency();
    }

}
