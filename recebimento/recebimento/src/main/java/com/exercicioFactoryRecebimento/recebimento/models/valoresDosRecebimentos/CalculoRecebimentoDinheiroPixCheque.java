package com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos;

import java.math.BigDecimal;

public class CalculoRecebimentoDinheiroPixCheque implements  ICalculoRecebimentos{


    @Override
    public BigDecimal calcularRecebimento(BigDecimal valorAReceber) {
        return new BigDecimal("0");
    }

    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return null;
    }
}
