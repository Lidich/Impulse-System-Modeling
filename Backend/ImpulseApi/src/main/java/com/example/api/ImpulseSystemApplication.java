package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImpulseSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImpulseSystemApplication.class, args);
		System.out.println("we are live \n" +
				"api endpoiints: http://127.0.0.1:8080/api/ \n" +
				"swagger: http://127.0.0.1:8080/swagger-ui/index.html +\n" +
				"main page: http://127.0.0.1:8080/main");
	}

}
