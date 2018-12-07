package com.aman.springboot.hello.controller;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aman.verma
 *
 */

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "") String name) {
        return "".equals(name) ? "" : "Hello " + name + "\nWelcome to Spring Boot !!!";
    }

    // Method which displays all the beans associated with the application.
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
