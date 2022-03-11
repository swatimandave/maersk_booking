package com.java.service;

import com.java.bean.Customer;
import com.java.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public int getAvailability() {
        int count = customerRepository.getAll();
        return 0;
    }

    @Override
    public String addCustomer(Customer customer) {
        return "BookingRef";
    }

}
