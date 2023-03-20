package com.arditzubaku.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("JPA") //named bean
public class CustomerJPADataAccessService implements ICustomerDAO {

    private final ICustomerRepository customerRepository;

    public CustomerJPADataAccessService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> selectCustomersByID(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public void insertCostumer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customerRepository.existsByEmail(email);
    }

    @Override
    public boolean existsPersonWithId(Integer identifier) {
        return customerRepository.existsCustomerById(identifier);
    }

    @Override
    public void deleteCustomerById(Integer identifier) {
        customerRepository.deleteCustomerById(identifier);
    }
}
