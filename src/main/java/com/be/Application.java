package com.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.be.repositories.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("\n\n\n");
		System.out.println("[Swagger-ui]: http://localhost:8080/swagger-ui/index.html");
		System.out.println("[Swagger-api-docs]: http://localhost:8080/docs");
		System.out.println("[MongoDB]: http://localhost:27017/Future");
		System.out.println("[Server]: http://localhost:8080/");
		System.out.println("\n\n\n");
	}
}
