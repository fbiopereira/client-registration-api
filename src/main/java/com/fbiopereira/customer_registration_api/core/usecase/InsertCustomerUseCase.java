package com.fbiopereira.customer_registration_api.core.usecase;

import com.fbiopereira.customer_registration_api.core.domain.Customer;

public interface InsertCustomerUseCase {

    Customer insertCustomer(Customer customer, String zipCode);


}
