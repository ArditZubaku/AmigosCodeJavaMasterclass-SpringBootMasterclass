package com.example.demo;

import com.example.demo.security.ApplicationUserPermission;
import com.example.demo.security.ApplicationUserRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
/*		System.out.println(ApplicationUserPermission.COURSE_READ.getPermission());
		System.out.println(ApplicationUserPermission.COURSE_READ.name());*/
	}

}
