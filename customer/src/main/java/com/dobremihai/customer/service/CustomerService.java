package com.dobremihai.customer.service;

import com.dobremihai.customer.repository.CustomerRepository;
import com.dobremihai.customer.model.Customer;
import com.dobremihai.customer.request.CustomerRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstName(request.getFirstName()).lastName(request.getLastName()).email(request.getEmail()).build();
        customerRepository.save(customer);

    }
}
