package com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos;

import java.math.BigDecimal;

public class CalculoDesconto implements ICalculoPagamentos{

    @Override
    public BigDecimal calculoPagamento(BigDecimal valorAPagar, BigDecimal diferencaDeValor) {
        BigDecimal resultadoComDesconto = valorAPagar.subtract(diferencaDeValor);
        return resultadoComDesconto;
    }
}
