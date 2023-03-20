package com.arditzubaku.customer;

import com.arditzubaku.customer.requests.CustomerRegistrationRequest;
import com.arditzubaku.customer.requests.CustomerUpdateRequest;
import com.arditzubaku.exception.DuplicateResourceException;
import com.arditzubaku.exception.RequestValidationException;
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
        if (!customerDAO.existsPersonWithId(identifier)) {
            throw new ResourceNotFoundException(
                    "Customer with id:{%s} not found!!!".formatted(identifier)
            );
        }

        customerDAO.deleteCustomerById(identifier);
    }

    public void updateCustomer(Integer customerId, CustomerUpdateRequest request) {
        Customer customer = getCustomer(customerId);

        boolean changes = false;

        if (request.name() != null && !request.name().equals(customer.getName())) {
            customer.setName(request.name());
            changes = true;
        }

        if (request.age() != null && !request.age().equals(customer.getAge())) {
            customer.setAge(request.age());
            changes = true;
        }

        if (request.email() != null && !request.email().equals(customer.getEmail())) {
            if (customerDAO.existsPersonWithEmail(request.email())) {
                throw new DuplicateResourceException("Email already taken!!!");
            }
            customer.setEmail(request.email());
            changes = true;
        }

        if (!changes) {
            throw new RequestValidationException("No data changes were found!!!");
        }

        customerDAO.updateCustomer(customer);
    }

}
