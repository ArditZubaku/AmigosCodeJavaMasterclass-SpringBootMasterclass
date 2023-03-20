package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Repository("DatabaseRepo")
//@Primary
public class CustomerRepository implements ICustomerRepo{ //DAO layer
    @Override
    public List<Customer> getCustomers() {
        // TODO: connect to a real database
        return Collections.emptyList();
    }
}
