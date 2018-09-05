package com.aman.springboot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aman.springboot.controller.StudentController;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication(scanBasePackages = "com.aman.springboot")
public class ApplicationLauncher {

	public static void main(String[] args) {
		SpringApplication.run(StudentController.class, args);
	}
}