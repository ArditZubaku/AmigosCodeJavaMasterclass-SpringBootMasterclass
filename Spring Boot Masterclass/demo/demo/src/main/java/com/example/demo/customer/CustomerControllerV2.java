package com.example.demo.customer;

import com.example.demo.exceptions.APIRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/customers")
public class CustomerControllerV2 { //API Layer

    private final CustomerService customerService; // immutability achieved

    @Autowired // optional
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*@GetMapping(value = "all")*/
    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long customerId) {
        throw new APIRequestException(
                String.format("API Request exception for customer: [%s]", customerId)
        );
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer) { // maps the JSON payload into Customer
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

