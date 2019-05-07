package com.smart.school.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.school.entity.Principal;

@RestController
@RequestMapping("/v1")
public class AdminResource {

	@PostMapping("/principal")
	public ResponseEntity<String> addPrincipal( @RequestBody Principal principal ) {
		
		return new ResponseEntity<String>( "Principal added", HttpStatus.OK );
	}
	
}
