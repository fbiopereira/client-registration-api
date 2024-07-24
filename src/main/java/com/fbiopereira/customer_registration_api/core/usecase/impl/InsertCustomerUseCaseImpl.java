package com.fbiopereira.customer_registration_api.core.usecase.impl;

import com.fbiopereira.customer_registration_api.core.dataprovider.FindAddressByZipCode;
import com.fbiopereira.customer_registration_api.core.dataprovider.InsertCustomer;
import com.fbiopereira.customer_registration_api.core.domain.Customer;
import com.fbiopereira.customer_registration_api.core.usecase.InsertCustomerUseCase;
import com.fbiopereira.customer_registration_api.core.domain.Address;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }


    @Override
    public Customer insertCustomer(Customer customer, String zipCode) {

        Address address = findAddressByZipCode.find(zipCode);

        customer.setAddress(address);

        return null;
    }


}
