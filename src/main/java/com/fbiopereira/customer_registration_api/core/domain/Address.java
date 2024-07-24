package com.fbiopereira.customer_registration_api.core.domain;

public class Address {

    private String street;
    private String city;
    private String state;
    private String number;
    private String complement;
    private String postalCode;

    public Address(String street, String city, String state, String number, String complement, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.number = number;
        this.complement = complement;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getPostalCode() {
        return postalCode;
    }

}
