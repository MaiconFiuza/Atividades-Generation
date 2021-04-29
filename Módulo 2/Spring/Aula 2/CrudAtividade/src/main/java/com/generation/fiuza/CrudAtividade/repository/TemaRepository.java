package com.generation.fiuza.CrudAtividade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.fiuza.CrudAtividade.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
