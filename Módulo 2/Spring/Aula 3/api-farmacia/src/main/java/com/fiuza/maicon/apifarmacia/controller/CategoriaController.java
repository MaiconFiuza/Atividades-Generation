package com.fiuza.maicon.apifarmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiuza.maicon.apifarmacia.model.Categoria;
import com.fiuza.maicon.apifarmacia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaRepository repository;
	
	//Buscar todos
	@GetMapping
	public ResponseEntity<List<Categoria>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	//Buscar pelo id
	@GetMapping("/{id}")
	public ResponseEntity<Categoria>GetById(@PathVariable long id ){
		return repository.findById(id).map(result-> ResponseEntity.ok(result)).orElse(ResponseEntity.notFound().build());
	}
	
	
	//Buscar pela descrição
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>>GetByDescricao(@PathVariable String descricao){ 
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	//Cadastrar 
	@PostMapping
	public ResponseEntity<Categoria>post(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	//Alterar 
	@PutMapping
	public ResponseEntity<Categoria>put(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	//Deletar
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
