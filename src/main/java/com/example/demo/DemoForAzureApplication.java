package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoForAzureApplication {
	
	@GetMapping("/result")
	public String getResult() {
		
		return "This is just demo...!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoForAzureApplication.class, args);
	}

}
