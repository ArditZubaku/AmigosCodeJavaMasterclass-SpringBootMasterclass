package com.example.demo.customer;

import com.example.demo.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
@AllArgsConstructor
@Slf4j // logger
public class CustomerService { // Service layer - Business logic

  /*  private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);*/

    /*@Qualifier has higher priority than @Primary annotation.*/

    //    private final ICustomerRepo customerRepo;
    private final ICustomerRepository customerRepository;

/*    @Autowired
    public CustomerService(*//*@Qualifier("FakeRepo")*//* ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }*/

    List<Customer> getCustomers() {
     /*   LOGGER.info("getCustomers was called");*/
        log.info("getCustomers was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long customerId) {
        /*getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst()*/
        return customerRepository
                .findById(customerId)
                .orElseThrow(
                        () -> {
                            NotFoundException notFoundException = new NotFoundException
                                    ("Customer with id [%s] not found".formatted(customerId));
                            log.error("ERROR in getting customer {}",customerId, notFoundException);
                            return notFoundException;
                        });
    }
}
