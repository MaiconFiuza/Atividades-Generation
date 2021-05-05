package com.fiuza.maicon.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiuza.maicon.minhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria>findByClassificaoEtariaContainingIgnoreCase(String classificacao);

}
