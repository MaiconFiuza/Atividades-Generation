package com.fiuza.exercicioDois.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class objetivoController {

	@GetMapping
	public String objetivosAprendizado(){
		return "Os objetivos de aprendizado dessa semana é começar a aprender Spring Boot e ir tocando o projeto Final";
	}
	
	
}
