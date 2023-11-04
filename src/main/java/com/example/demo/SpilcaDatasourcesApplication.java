package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers","repositories"})
public class SpilcaDatasourcesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpilcaDatasourcesApplication.class, args);
	}
	
	

}
