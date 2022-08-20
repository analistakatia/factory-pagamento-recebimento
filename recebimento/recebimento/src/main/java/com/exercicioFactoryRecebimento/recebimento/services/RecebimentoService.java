package com.exercicioFactoryRecebimento.recebimento.services;

import com.exercicioFactoryRecebimento.recebimento.models.RecebimentoModel;
import com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos.RecebimentoFactory;
import com.exercicioFactoryRecebimento.recebimento.repositories.IRecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {
    @Autowired
    private IRecebimentoRepository recebimentosRepository;

    public List<RecebimentoModel> buscarTodos() {
        return recebimentosRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarPorId(Long codigo) {
        return recebimentosRepository.findById(codigo);
    }
    public RecebimentoModel cadastrar(RecebimentoModel recebimentoModel, RecebimentoFactory recebimentoFactory){
        BigDecimal resultado = recebimentoFactory.getStatusRecebimento(recebimentoModel.getStatusDoRecebimento()).calcular(recebimentoModel.getValorAReceber());
        BigDecimal resultadoFinal = recebimentoModel.getValorAReceber().subtract(resultado);
        recebimentoModel.getCodigo();
        recebimentoModel.getValorAReceber();
        recebimentoModel.getStatusDoRecebimento();
        recebimentoModel.setValorDoDesconto(resultado);
        recebimentoModel.setValorFinal(resultadoFinal);
        return recebimentosRepository.save(recebimentoModel);
    }

    public void deletar(Long codigo) {
        recebimentosRepository.deleteById(codigo);
    }
}
