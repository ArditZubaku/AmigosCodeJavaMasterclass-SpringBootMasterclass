package com.arditzubaku.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ICustomerRepository
        extends JpaRepository<Customer, Integer>{
    // Customer -> the entity upon which it will act
    // Integer -> the type of the primary key

    boolean existsByEmail(String email);
    boolean existsCustomerById(Integer id);
    void deleteCustomerById(Integer id);
}
