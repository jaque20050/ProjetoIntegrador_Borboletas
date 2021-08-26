package com.borboletas.Borboletas.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.borboletas.Borboletas.model.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
