package com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos;

import java.math.BigDecimal;

public class CalculoRecebimentoValeRefeicao implements ICalculoRecebimentos{

    @Override
    public BigDecimal calcularRecebimento(BigDecimal valorAReceber) {
        return null;
    }

    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        BigDecimal resultado = valorAReceber.multiply(new BigDecimal("0.042"));
        return resultado;
    }
}
