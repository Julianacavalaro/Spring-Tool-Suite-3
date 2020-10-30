package com.helloworld.helloAtividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloAtividade1")
public class HelloAtividade1Controller {

	@GetMapping
	public String habilidades() {
		return "persistencia, comunicacao, atencao aos detalhes";
	}
}
