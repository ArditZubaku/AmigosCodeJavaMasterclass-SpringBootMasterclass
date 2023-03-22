package com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("DatabaseRepo")
//@Primary
public interface ICustomerRepository extends JpaRepository<Customer, Long> { //DAO layer

}
