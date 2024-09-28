package com.javatechie.app.sonar_example;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class TestController {

	@GetMapping
	public void wel(HttpServletResponse response) throws IOException {
		response.sendRedirect("swagger-ui.html");
	}

	@GetMapping("/msg")
	public String welcome() {
		return "welcome message";
	}

	@GetMapping("/msg/{id}")
	public String welcome1(@PathVariable String id) {
		return "welcome message:" + id;
	}

	@PostMapping("/msg")
	public String welcome(@RequestParam String str) {
		return "welcome message:" + str;
	}

}
