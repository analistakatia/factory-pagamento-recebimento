package com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos;

import com.exercicioFactoryPagamento.pagamento.models.PagamentoModel;

import java.math.BigDecimal;

public class CalculoAcrescimo implements ICalculoPagamentos{


    @Override
    public BigDecimal calculoPagamento(BigDecimal valorAPagar, BigDecimal diferencaDeValor) {
        BigDecimal resultadoComAcrescimo = valorAPagar.add(diferencaDeValor);
        return resultadoComAcrescimo;
    }
}
