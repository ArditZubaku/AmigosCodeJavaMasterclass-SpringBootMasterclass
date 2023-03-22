package com.example.demo.customer;

import com.example.demo.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Value("${info.app.name}")
    private String appName;

    @Autowired
    private Environment environment;


    @Bean // instantiates the CLR class for us
    public CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println("Command line runner!!!");
            System.out.println(appName);
            System.out.println(environment.getProperty("info.app.description"));
            System.out.println(infoApp);
        };
    }

    @Bean
    public ICustomerRepo customerRepo() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        // instantiation
        return new CustomerFakeRepository();
    }
}
