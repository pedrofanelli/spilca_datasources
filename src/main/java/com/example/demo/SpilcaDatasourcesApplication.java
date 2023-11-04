package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers","repositories"})
public class SpilcaDatasourcesApplication {

	@Value("${custom.datasource.url}")
	private String datasourceUrl;
	
	@Bean
	public DataSource dataSource() {
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpilcaDatasourcesApplication.class, args);
	}
	
	

}
