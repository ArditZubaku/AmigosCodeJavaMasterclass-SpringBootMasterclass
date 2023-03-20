package com.arditzubaku.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("JPA") //named bean
public class CustomerJPADataAccessService implements ICustomerDAO{

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
}
