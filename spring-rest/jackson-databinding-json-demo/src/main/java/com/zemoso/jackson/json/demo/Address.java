package com.zemoso.jackson.json.demo;

import lombok.Data;

@Data
public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {

    }

}
