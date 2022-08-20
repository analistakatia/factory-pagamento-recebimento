package com.exercicioFactoryRecebimento.recebimento.repositories;

import com.exercicioFactoryRecebimento.recebimento.models.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
