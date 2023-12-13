package domain;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Company {

    private Address address;

    public Company(Address address){
        this.address = address;
    }

}
