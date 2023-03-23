package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

//@Component
//@Repository("FakeRepo")
//@Primary
public class CustomerFakeRepository implements ICustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Customer1", "123", "email1@gmail.com"),
                new Customer(2L, "Customer2", "1234", "email2@gmail.com")
        );
    }
}
