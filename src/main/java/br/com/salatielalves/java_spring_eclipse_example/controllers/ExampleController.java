package br.com.salatielalves.java_spring_eclipse_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExampleController {
	
	@GetMapping("/hello-word")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!"); 
		//teste
	}

}
