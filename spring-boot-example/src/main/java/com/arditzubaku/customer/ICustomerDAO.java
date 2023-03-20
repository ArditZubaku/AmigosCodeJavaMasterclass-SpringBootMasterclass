package com.arditzubaku.customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerDAO {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomersByID(Integer id);
    void insertCostumer(Customer customer);
    boolean existsPersonWithEmail(String email);
    boolean existsPersonWithId(Integer identifier);
    void deleteCustomerById(Integer identifier);
    void updateCustomer(Customer customer);
}
