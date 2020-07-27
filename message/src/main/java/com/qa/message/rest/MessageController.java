package com.qa.message.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/message")
public class MessageController {

	RestTemplate rest;

	public MessageController(RestTemplateBuilder builder) {
		super();
		this.rest = builder.build();
	}

	@GetMapping("/get")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok(new String("Hello, World!"));
	}

}
