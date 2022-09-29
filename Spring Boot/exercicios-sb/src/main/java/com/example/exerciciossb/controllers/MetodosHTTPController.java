package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodosHTTPController {

	@GetMapping
	public String get() {
		return "Requisisçao GET";
	}

	@PostMapping
	public String post() {
		return "Requisisçao POST";
	}

	@PutMapping
	public String put() {
		return "Requisisçao PUT";
	}

	@PatchMapping
	public String patch() {
		return "Requisisçao PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisisçao DELETE";
	}
}
