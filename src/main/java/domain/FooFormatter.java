package domain;

import org.springframework.stereotype.Component;

@Component
@FormatterType(value = "Foo") // we define value attribute in FormatterType
public class FooFormatter implements Formatter{

    @Override
    public String format() {
        return "Foo Formatter";
    }

}
