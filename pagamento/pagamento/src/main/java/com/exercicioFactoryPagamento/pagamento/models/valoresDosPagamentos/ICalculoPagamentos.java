package com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos;

import com.exercicioFactoryPagamento.pagamento.models.PagamentoModel;

import java.math.BigDecimal;

public interface ICalculoPagamentos {
    public BigDecimal calculoPagamento(BigDecimal valorAPagar, BigDecimal diferencaDeValor);
}
