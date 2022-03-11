package com.java.service;

import com.java.bean.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public int getAvailability();

    String addCustomer(Customer customer);
}
