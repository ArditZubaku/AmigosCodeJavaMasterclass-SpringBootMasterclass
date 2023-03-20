package com.arditzubaku.customer;

import com.arditzubaku.exception.DuplicateResourceException;
import com.arditzubaku.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service/*("CustomerServiceBean")*/
// alias for @Component - any class with business logic should be annotated with this to become a bean
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@RequestScope
public class CustomerService {

    private final ICustomerDAO customerDAO;

    public CustomerService(@Qualifier("JPA") ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }


    public List<Customer> getAllCustomers() {
        return this.customerDAO.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDAO.selectCustomersByID(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Customer with id:{%d} not found!!!".formatted(id)
                        )
                );
    }

    public void addCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        // Check if email exists, if not then add.
        if (customerDAO.existsPersonWithEmail(customerRegistrationRequest.email())) {
            throw new DuplicateResourceException("Email already taken!");
        }
        customerDAO.insertCostumer(
                new Customer(
                        customerRegistrationRequest.name(),
                        customerRegistrationRequest.email(),
                        customerRegistrationRequest.age()
                )
        );
    }


    public void deleteCustomerById(Integer identifier) {
        if (!customerDAO.existsPersonWithId(identifier)){
            throw new ResourceNotFoundException(
                    "Customer with id:{%s} not found!!!".formatted(identifier)
            );
        }

        customerDAO.deleteCustomerById(identifier);
    }
}
