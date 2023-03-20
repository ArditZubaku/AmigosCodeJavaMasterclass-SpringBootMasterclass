package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class CustomerService { // Service layer - Business logic

    /*@Qualifier has higher priority than @Primary annotation.*/

    private final ICustomerRepo customerRepo;

    @Autowired
    public CustomerService(/*@Qualifier("FakeRepo")*/ ICustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }

}
