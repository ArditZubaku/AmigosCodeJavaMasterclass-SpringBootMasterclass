package com.arditzubaku;

import com.arditzubaku.customer.Customer;
import com.arditzubaku.customer.ICustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        System.out.println(customers);
/*        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);*/

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);
//        printBeans(applicationContext);

/*      FooService fooService = new FooService(new Foo("bar"));
        System.out.println(fooService.getFooName());*/

    }

    private static void printBeans(ConfigurableApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Bean
    CommandLineRunner commandLineRunner(ICustomerRepository customerRepository) {
//        System.out.println( customerRepository.findById(1).stream().count());
        return args -> {
            Customer customer1 = new Customer("Customer1", "customer1@gmail.com", 20);
            Customer customer2 = new Customer("Customer2", "customer2@gmail.com", 25);
            List<Customer> customers = List.of(customer1, customer2);
            customerRepository.saveAll(customers);
        };
    }

    @Bean(value = "fooBean") // gets managed by Spring container from now on
    public Foo getFoo() {
        return new Foo("bar");
    }

    record Foo(String name) {
    }


}
