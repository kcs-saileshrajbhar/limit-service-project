package com.limit.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.microservices.bean.Limits;

@RestController
public class LimitController {

	@GetMapping("/limits")
	public Limits retriveLimits() {
		System.out.println("hello");
		return new Limits(1,1000);
	}
}
