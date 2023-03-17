package com.arditzubaku.customer;

import java.util.List;

public class CustomerService {

    private final ICustomerDAO customerDAO;

    public CustomerService(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }


    public List<Customer> getAllCustomers() {
        return this.customerDAO.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDAO.selectCustomersByID(id)
                .orElseThrow(
                        () -> new IllegalArgumentException(
                                "Customer with {%d} found!!!".formatted(id)
                        )
                );
    }

}
