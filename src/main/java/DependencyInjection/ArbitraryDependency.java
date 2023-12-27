package DependencyInjection;

import org.springframework.stereotype.Component;

//@Component
@Component(value="autowiredFieldDependency")
public class ArbitraryDependency {

    public String toString(){
        return "Arbitrary Dependency";
    }

}
