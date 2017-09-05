package com.manish.javadev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.manish.javadev.controller")
public class FirstSpringBootDemoAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootDemoAppApplication.class, args);
	}
}
