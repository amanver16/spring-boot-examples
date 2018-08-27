package com.aman.springboot.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aman.springboot.controller.HelloController;

/**
 * @author aman.verma
 *
 */

@SpringBootApplication
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}
