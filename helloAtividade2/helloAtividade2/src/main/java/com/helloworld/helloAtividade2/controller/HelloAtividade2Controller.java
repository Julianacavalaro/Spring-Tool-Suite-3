package com.helloworld.helloAtividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloAtividade2")
public class HelloAtividade2Controller {

	@GetMapping
	public String objetivos() {
		return "Aprender Spring";
	}
}
