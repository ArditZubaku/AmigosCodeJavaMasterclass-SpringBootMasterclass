package com.example.demo.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceholderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(IJSONPlaceholderClient placeholderClient) {
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(placeholderClient.getPosts().size());
            System.out.println();
            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println(placeholderClient.getPost(1));
        };
    }

}
