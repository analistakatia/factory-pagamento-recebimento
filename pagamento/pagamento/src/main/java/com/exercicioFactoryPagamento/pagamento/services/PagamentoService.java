package com.exercicioFactoryPagamento.pagamento.services;

import com.exercicioFactoryPagamento.pagamento.models.PagamentoModel;
import com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos.CalculoAcrescimo;
import com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos.CalculoDesconto;
import com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos.ICalculoPagamentos;
import com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos.PagamentoFactory;
import com.exercicioFactoryPagamento.pagamento.repositories.PagamentoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoModel> buscarTodos(){
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long codigo){
        return pagamentoRepository.findById(codigo);
    }

    public PagamentoModel pagamentoAtrasado(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        BigDecimal resultado = pagamentoFactory.calculoPagamentos(pagamentoModel.getStatusDoPagamento()).calculoPagamento(pagamentoModel.getValorAPagar(), pagamentoModel.getValorDoAcrescimo());

        pagamentoModel.getCodigo();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getStatusDoPagamento();
        pagamentoModel.getValorDoAcrescimo();
        pagamentoModel.getValorFinal();
        pagamentoModel.setValorFinal(resultado);
        return pagamentoRepository.save(pagamentoModel);
    }

    public PagamentoModel pagamentoEmDia(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        BigDecimal resultado = pagamentoFactory.calculoPagamentos(pagamentoModel.getStatusDoPagamento()).calculoPagamento(pagamentoModel.getValorAPagar(), pagamentoModel.getValorDoDesconto());

        pagamentoModel.getCodigo();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getStatusDoPagamento();
        pagamentoModel.getValorDoAcrescimo();
        pagamentoModel.getValorFinal();
        pagamentoModel.setValorFinal(resultado);
        return pagamentoRepository.save(pagamentoModel);
    }
    public PagamentoModel alterarPagamentoAtrasado(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){

        pagamentoModel.getCodigo();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getStatusDoPagamento();
        pagamentoModel.getValorDoAcrescimo();
        //pagamentoModel.getValorFinal();
        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletarPgtoAtrasado(Long codigo){
        pagamentoRepository.deleteById(codigo);
    }


    public PagamentoModel alterarPagamentoEmDia(PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){

        pagamentoModel.getCodigo();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getStatusDoPagamento();
        pagamentoModel.getValorDoDesconto();
        //pagamentoModel.getValorFinal();
        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletarPgtoEmDia(Long codigo){
        pagamentoRepository.deleteById(codigo);
    }

}
