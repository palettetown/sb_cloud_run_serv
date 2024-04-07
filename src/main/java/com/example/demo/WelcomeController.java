package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcom() {
		return "welcome to my app";
	}	

}
