package com.jpa.jpaprogramsp.controller;

import com.jpa.jpaprogramsp.model.Customer;
import com.jpa.jpaprogramsp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value="/savecustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved";
    }
}
