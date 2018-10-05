package com.aman.solid.isp.athlete.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.aman.solid.isp")
public class AthleteClient {
	public static void main(String[] args) {
		SpringApplication.run(AthleteClient.class, args);
	}
}
