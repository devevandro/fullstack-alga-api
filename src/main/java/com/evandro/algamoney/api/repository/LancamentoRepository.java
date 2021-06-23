package com.evandro.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evandro.algamoney.api.model.Lancamento;
import com.evandro.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
