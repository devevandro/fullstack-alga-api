package com.evandro.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
