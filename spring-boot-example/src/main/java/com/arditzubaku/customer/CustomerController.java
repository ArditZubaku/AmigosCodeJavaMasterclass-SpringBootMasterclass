package com.arditzubaku.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // handles HTTP reqs
@RequestMapping("api/v1/customers") //root path for every method inside the class
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*    @RequestMapping(
                path = "api/v1/customer",
                method = RequestMethod.GET
        )*/ // same as
    @GetMapping // now this method will be able to intercept requests coming from clients
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{customerID}")
//   @GetMapping("{customerID}") // same thing
    public Customer getCustomer(@PathVariable("customerID")
                                Integer customerID) {
        return customerService.getCustomer(customerID);
    }

    @PostMapping()
    public void registerCustomer(
            @RequestBody CustomerRegistrationRequest request){
        customerService.addCustomer(request);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(
            @PathVariable("id") Integer identifier
    ){
        customerService.deleteCustomerById(identifier);
    }
}
