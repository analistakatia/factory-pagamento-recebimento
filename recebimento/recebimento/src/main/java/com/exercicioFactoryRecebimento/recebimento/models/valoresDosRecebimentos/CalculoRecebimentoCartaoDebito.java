package com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos;

import java.math.BigDecimal;

public class CalculoRecebimentoCartaoDebito implements ICalculoRecebimentos{
    @Override
    public BigDecimal calcularRecebimento(BigDecimal valorAReceber) {
        return null;
    }

    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        BigDecimal resultado = valorAReceber.multiply(new BigDecimal("0.025"));
        return resultado;
    }

}
