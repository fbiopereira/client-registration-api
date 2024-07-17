package com.fbiopereira.customer_registration_api.core.domain;

public class Customer {

    private String registrationId;
    private String name;
    private String fiscalNumber;
    private Boolean isFiscalNumberValid;
    private Address address;


    public Customer(String registrationId, String name, String fiscalNumber, Boolean isFiscalNumberValid, Address address) {
        this.registrationId = registrationId;
        this.name = name;
        this.fiscalNumber = fiscalNumber;
        this.isFiscalNumberValid = isFiscalNumberValid;
        this.address = address;
    }

    public Customer() {
        this.isFiscalNumberValid = false;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getName() {
        return name;
    }

    public String getFiscalNumber() {
        return fiscalNumber;
    }

    public Boolean getFiscalNumberValid() {
        return isFiscalNumberValid;
    }

    public Address getAddress() {
        return address;
    }
}
