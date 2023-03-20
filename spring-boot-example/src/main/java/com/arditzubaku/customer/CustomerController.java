package com.arditzubaku.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // handles HTTP reqs
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*    @RequestMapping(
                path = "api/v1/customer",
                method = RequestMethod.GET
        )*/ // same as
    @GetMapping("api/v1/customers") // now this method will be able to intercept requests coming from clients
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("api/v1/customers/{customerID}")
    public Customer getCustomer(@PathVariable("customerID")
                                Integer customerID) {
        return customerService.getCustomer(customerID);
    }
}
