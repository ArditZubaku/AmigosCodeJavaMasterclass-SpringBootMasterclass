package com.arditzubaku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        System.out.println(customers);
/*        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);*/

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        printBeans(applicationContext);

/*      FooService fooService = new FooService(new Foo("bar"));
        System.out.println(fooService.getFooName());*/

    }

    private static void printBeans(ConfigurableApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Bean (value = "fooBean") // gets managed by Spring container from now on
    public Foo getFoo() {
        return new Foo("bar");
    }

    record Foo(String name) {
    }


}
