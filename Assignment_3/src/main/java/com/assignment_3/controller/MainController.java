package com.assignment_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/front_page")
public String web_controller() {
	return "Hello World";
}
}
