package com.fiuza.maicon.minhaLojaDeGames.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiuza.maicon.minhaLojaDeGames.model.Categoria;
import com.fiuza.maicon.minhaLojaDeGames.repository.CategoriaRepository;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	
	public Optional<Categoria>cadastrarCategoria(Categoria novaCategoria){
		
		Optional<Categoria>categoriaExistente = repository.findById(novaCategoria);
		if(categoriaExistente.isPresent()) {
			return Optional.empty();
		}
		
		Optional<Categoria> categoriaCadastrado = Optional.ofNullable(repository.save(novaCategoria));
		if (categoriaCadastrado.isPresent()) {
			return categoriaCadastrado;
		} else {
			return Optional.empty();
		}
	
	}
	
	
	
	
	
}
