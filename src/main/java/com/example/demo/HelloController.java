package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String sayHello() {
		return ("Hello Rudi XXX");	
	}

	@GetMapping("/test")
	public String sayTest() {
		return ("Hello ... This is a test");	
	}
}}
