package com.rags.props;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//import jakarta.annotation.PostConstruct;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "plan-msg")
@Configuration
@EnableConfigurationProperties
public class AppMessages {

	private Map<String, String> messages = new LinkedHashMap<>();
	
	/*
	 * @PostConstruct public void init() { System.out.println("Loaded messages: " +
	 * messages); // Debugging output }
	 */
}
