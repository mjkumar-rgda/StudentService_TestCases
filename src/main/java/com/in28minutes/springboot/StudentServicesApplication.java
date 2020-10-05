package com.in28minutes.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = {"file:StudentService_TestCases/application.properties"})
public class StudentServicesApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(StudentServicesApplication.class);
	
	@Value("${spring.datasource.driver-class-name}")
	private static String driver;

	public static void main(String[] args) {
		
		LOGGER.info(" Driver details   : "+ driver);
		SpringApplication.run(StudentServicesApplication.class, args);
		
	}
}
