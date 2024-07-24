package com.fbiopereira.customer_registration_api.core.dataprovider;

import com.fbiopereira.customer_registration_api.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String ZipCode);
}
