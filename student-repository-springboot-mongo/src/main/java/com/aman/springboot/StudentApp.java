package com.aman.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication(scanBasePackages = "com.aman.springboot")
public class StudentApp {

	public static void main(String[] args) {
		SpringApplication.run(StudentApp.class, args);
	}
}