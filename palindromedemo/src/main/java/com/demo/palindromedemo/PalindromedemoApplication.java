package com.demo.palindromedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.palindromedemo", "com.demo.service"})
public class PalindromedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalindromedemoApplication.class, args);
	}

}
