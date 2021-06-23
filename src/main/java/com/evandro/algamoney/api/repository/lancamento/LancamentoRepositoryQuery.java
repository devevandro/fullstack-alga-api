package com.evandro.algamoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evandro.algamoney.api.model.Lancamento;
import com.evandro.algamoney.api.repository.filter.LancamentoFilter;
import com.evandro.algamoney.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	/* public List<Lancamento> filtrar(LancamentoFilter lancamentoFIlter); */
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFIlter, Pageable pageable);
	
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFIlter, Pageable pageable);
}
