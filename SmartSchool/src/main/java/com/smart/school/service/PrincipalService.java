package com.smart.school.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/principal")
public class PrincipalService {

	@PostMapping("/add")
	public ResponseEntity<String> addPrincipal() {
		String message = "New principal added";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
}
