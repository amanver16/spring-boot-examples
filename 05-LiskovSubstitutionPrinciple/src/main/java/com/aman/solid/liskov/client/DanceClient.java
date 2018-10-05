package com.aman.solid.liskov.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.aman.solid.liskov")
public class DanceClient {

	public static void main(String[] args) {
		SpringApplication.run(DanceClient.class, args);
	}
}
