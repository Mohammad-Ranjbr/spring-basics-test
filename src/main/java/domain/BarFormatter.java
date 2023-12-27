package domain;

import org.springframework.stereotype.Component;

@Component
@FormatterType("Bar")
public class BarFormatter implements Formatter{

    @Override
    public String format() {
        return "Bar Formatter";
    }

}
