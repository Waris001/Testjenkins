package com.rags.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySwaggerConfigurarion {

	@Bean
    public GroupedOpenApi plansApi() {
        return GroupedOpenApi.builder()
            .group("plans")
            .packagesToScan("com.rags.plans.controller") // Replace with your actual package
            .build();
    }
	
	
}
