package com.example.demo.customer;

import com.example.demo.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long customerId) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()
                .orElseThrow(
                        ()->new NotFoundException
                                ("Customer with id [%s] not found".formatted(customerId)));
    }
}
