package com.aman.solid.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.aman.solid")
public class ShapeClient {

	public static void main(String[] args) {
		SpringApplication.run(ShapeClient.class, args);
	}
}