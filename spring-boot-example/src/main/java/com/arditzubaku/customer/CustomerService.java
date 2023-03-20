package com.arditzubaku.customer;

import com.arditzubaku.exception.ResourceNotFound;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

//@Component
@Service // alias for @Component - any class with business logic should be annotated with this to become a bean
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@RequestScope
public class CustomerService {

    private final ICustomerDAO customerDAO;

    public CustomerService(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }


    public List<Customer> getAllCustomers() {
        return this.customerDAO.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDAO.selectCustomersByID(id)
                .orElseThrow(
                        () -> new ResourceNotFound(
                                "Customer with id:{%d} not found!!!".formatted(id)
                        )
                );
    }

}
