package com.aman.solid.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication(scanBasePackages = "com.aman.solid")
public class CustomerClient {

	public static void main(String[] args) {
		SpringApplication.run(CustomerClient.class, args);
	}
}