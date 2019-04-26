package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MicroserviceFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceFileApplication.class, args);
	}

}
