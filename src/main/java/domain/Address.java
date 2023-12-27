package domain;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public class Address {

    private String name = "AAA";
    private final int number;

    public Address(String name , int number){
        this.name = name ;
        this.number = number;
    }

}
