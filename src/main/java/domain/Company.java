package domain;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "companyy")
@Getter
public class Company {

    private final Address address;

    @Autowired(required = false)
    public Company(Address address){
        this.address = address;
    }

}
