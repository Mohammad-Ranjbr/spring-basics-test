package DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class ApplicationContextTestResourceQualifier {

    @Bean(name = "defaultFile")
    public File defaultFile(){
        return new File("default.txt");
    }

    @Bean(name = "namedFile")
    public File namedFile(){
        return new File("namedFile1.txt");
    }

}
