package com.fiuza.ExercicioUm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidadesHabilidades")
public class mentalidadeController {

	
	
	@GetMapping
	public String mentalidadeHabilidades()
	{
		return  "Mentalidades: Persistência - Habilidades: Atenção aos detalhes";
	}
	
	
}
