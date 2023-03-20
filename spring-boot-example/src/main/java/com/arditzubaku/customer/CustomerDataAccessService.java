package com.arditzubaku.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
@Repository // alias for @Component - any class of DAO services should be annotated with this to become a bean
public class CustomerDataAccessService implements ICustomerDAO {


    // database
    private static final List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer customer1 = new Customer(1, "Customer1", "customer1@gmail.com", 20);
        Customer customer2 = new Customer(2, "Customer2", "customer2@gmail.com", 25);
        customers.add(customer1);
        customers.add(customer2);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomersByID(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
