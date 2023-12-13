package domain;

import lombok.Getter;

@Getter
public class Address {

    private String name ;
    private int number;

    public Address(String name , int number){
        this.name = name ;
        this.number = number;
    }

}
