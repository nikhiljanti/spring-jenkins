package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/index")
	public String showData() {
		return "Welcome to Spring Jenkins...!";
	}

}
