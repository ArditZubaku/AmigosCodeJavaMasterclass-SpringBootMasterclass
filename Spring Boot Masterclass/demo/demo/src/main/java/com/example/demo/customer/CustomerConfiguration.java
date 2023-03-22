package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean // instantiates the CLR class for us
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner!!!");
        };
    }

    @Bean
    public ICustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        // instantiation
        return new CustomerFakeRepository();
    }
}
