package com.example.employee;

import com.example.employee.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@Slf4j
@EnableRetry
public class EmployeeApplication {

	private static ConfigurableApplicationContext ApplicationContext;

	public static void main(String[] args) {
		ApplicationContext = SpringApplication.run(EmployeeApplication.class, args);
		log.info("Application started");

		ProductService ps = ApplicationContext.getBean(ProductService.class);
		ps.test();

	}

}
