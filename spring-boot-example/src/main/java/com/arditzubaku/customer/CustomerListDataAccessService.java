package com.arditzubaku.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
@Repository("List")// alias for @Component - any class of DAO services should be annotated with this to become a bean
public class CustomerListDataAccessService implements ICustomerDAO {


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

    @Override
    public void insertCostumer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customers.stream().
                anyMatch(customer -> customer.getEmail().equals(email)
        );
    }

    @Override
    public boolean existsPersonWithId(Integer identifier) {
        return customers.stream().anyMatch(
                customer -> customer.getId().equals(identifier)
        );
    }

    @Override
    public void deleteCustomerById(Integer identifier) {
        customers.stream()
                .filter(customer -> customer.getId().equals(identifier))
                .findFirst()
                .ifPresent(customers::remove);
    }
}
