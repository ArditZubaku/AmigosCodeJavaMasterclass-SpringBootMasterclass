package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
@Deprecated
public class CustomerController { //API Layer

    private final CustomerService customerService; // immutability achieved

    @Autowired // optional
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("all")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) { // maps the JSON payload into Customer
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
        /*@DeleteMapping(path = "test{customerId}")*/
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID: " + id);
    }

}

