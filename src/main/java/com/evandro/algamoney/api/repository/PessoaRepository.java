package com.evandro.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
