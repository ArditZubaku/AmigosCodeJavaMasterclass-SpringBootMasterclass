package com.example.demo.customer;

import com.example.demo.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class CustomerService { // Service layer - Business logic

    /*@Qualifier has higher priority than @Primary annotation.*/

    //    private final ICustomerRepo customerRepo;
    private final ICustomerRepository customerRepository;

    @Autowired
    public CustomerService(/*@Qualifier("FakeRepo")*/ ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId) {
        /*getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()*/
        return customerRepository
                .findById(customerId)
                .orElseThrow(
                        () -> new NotFoundException
                                ("Customer with id [%s] not found".formatted(customerId)));
    }
}
