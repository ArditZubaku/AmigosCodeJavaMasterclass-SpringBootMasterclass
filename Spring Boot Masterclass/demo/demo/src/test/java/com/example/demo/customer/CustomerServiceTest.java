package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    private CustomerService underTest;
    @Autowired
    private ICustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test()
    void getCustomers() {
        // Given
        Customer customer1 = new Customer(1L, "customer 1", "password1", "customer1@gmail.com");
        Customer customer2 = new Customer(2L, "customer 2", "password2", "customer2@gmail.com");

        customerRepository.saveAll(Arrays.asList(customer1, customer2));
        // When
        List<Customer> customers = underTest.getCustomers();

        // Then
        //expected, actual
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        // Given
        Customer customer1 = new Customer(1L, "customer 1", "password1", "customer1@gmail.com");
        customerRepository.save(customer1);

        // When
        Customer actualCustomer = underTest.getCustomer(1L);

        // Then
        assertEquals(1L, actualCustomer.getId());
        assertEquals("customer 1", actualCustomer.getName());
        assertEquals("password1", actualCustomer.getPassword());
        assertEquals("customer1@gmail.com", actualCustomer.getEmail());
    }
}