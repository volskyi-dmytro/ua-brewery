package com.stpunk47.uabrewery.services;

import com.stpunk47.uabrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
