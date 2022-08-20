package com.exercicioFactoryPagamento.pagamento.repositories;

import com.exercicioFactoryPagamento.pagamento.models.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository <PagamentoModel, Long>{
}
