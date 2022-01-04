package com.learnings.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping(value = "/test")
	public String getFirstApiResponse() {
		return "Welcome to first API";
	}
}
