package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
		
	//Aula Luiza
	@Query(value = "select * from postagem where ano > 2011", nativeQuery = true)
	List<Postagem> findAllMaior();
	//mudar de findAllAtivas para findAllMaior na PostagemController.java
	
	@Query(value = "SELECT * FROM postagem where ano > 2011 ORDER BY ano DESC", nativeQuery = true)
	List<Postagem> anosDesc();
		
	@Query(value = "SELECT * FROM postagem where ano > 2011 ORDER BY ano ASC", nativeQuery = true)
	List<Postagem> anosAsc();
	
	@Query(value ="select * from postagem where ano >= 2011 and ano <=2013", nativeQuery = true)
	List<Postagem> anosIntervalos();
	//
}
