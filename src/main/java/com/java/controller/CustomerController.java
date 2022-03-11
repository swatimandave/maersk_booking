package com.java.controller;

import com.java.bean.Customer;
import com.java.repository.CustomerRepository;
import com.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/checkavailable", produces = "application/json; charset=utf-8")
    public String getAvailability() {
        int availability;
        availability = customerService.getAvailability();

        if (availability > 0) {
            return "{ \"availableSpace\" : true }";
        }
        else  if (availability==0)
        {
            return "{ \"availableSpace\" : false }";
        }

            return "{ \"availableSpace\" : true }";


    }

    @PostMapping("/addcustomer")
    public String  addCustomer(@RequestBody Customer customer)
    {
        String id = customerService.addCustomer(customer);

        return  "{ \"bookingRef\" : id }";

    }
}
