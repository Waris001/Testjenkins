package com.rags.plans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rags")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
 