package com.minami.meuprimeiroprojeto.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo/api")
public class ExemploController {
	
	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		return "olá " + nome;
	}

}