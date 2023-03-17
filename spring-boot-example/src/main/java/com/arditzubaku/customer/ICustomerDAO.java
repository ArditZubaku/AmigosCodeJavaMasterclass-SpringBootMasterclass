package com.arditzubaku.customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerDAO {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomersByID(Integer id);
}
