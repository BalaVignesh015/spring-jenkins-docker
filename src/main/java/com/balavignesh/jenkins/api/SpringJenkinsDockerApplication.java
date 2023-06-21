package com.balavignesh.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to SpringBoot Jenkins Docker Integration...!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerApplication.class, args);
	}

}
